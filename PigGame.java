import java.util.ArrayList;

public class PigGame {

    // Konstanter för spelregler och tillåtna gränsvärden
    private static final int MIN_PLAYERS = 2;
    private static final int MAX_PLAYERS = 10;

    private static final int DICE_SIDES = 6; // satt antal sidor

    private static final int WINNING_SCORE = 100;
    private static final int LOSING_ROLL = 1; // förlorar tillfällig pott

    // Skapa ett InputHandler-objekt för att läsa inmatning från terminalen
    private static final InputHandler input = new InputHandler(); // kan användas av main() och initialize()

    public static void main(String[] args) {

        // Initiera spelare och spelinställningar
        ArrayList<Player> players = initialize();

        // DEBUG: Kontrollera att spelarna skapats
        for (Player player : players) {
            // System.out.println("Created player: " + player.getName());
            takeTurn(player);
        }

        // TODO: Starta spelets turordning
        // TODO: Avsluta spelet när en spelare når 100 poäng

        // Stäng InputHandler när spelet är färdigt
        input.close();
    }
    
    // Skapa spelarna och tilldela varsin 6-sidig tärning
    private static ArrayList<Player> initialize() {

        // Skapa en lista som ska innehålla alla spelare
        ArrayList<Player> players = new ArrayList<>();

        // Läs in antalet spelare
        int numberOfPlayers = input.readInt(
            "Number of players (" + MIN_PLAYERS + "-" + MAX_PLAYERS + "): ", MIN_PLAYERS, MAX_PLAYERS
        );

        // Skapa spelarna och tilldela deras tärningar
        for (int i = 1; i <= numberOfPlayers; i++) {

            // Fråga efter spelarens namn
            String playerName = input.readName("Player " + i + " name: ");

            // Skapa ett nytt Player-objekt
            Player player = new Player(playerName);

            // Tilldela spelaren en tärning
            player.addDie(DICE_SIDES);

            // Lägg till spelaren i listan
            players.add(player);
        }

        return players;
    }

    // Hantera en spelares tur och tillfälliga pott
    private static void takeTurn(Player player) {

        // Skapa en tillfällig pott för spelarens turn
        int turnPot = 0;
        boolean keepRolling = true;

        // Visa vilken spelares tur det är
        System.out.println("\n" + player.getName() + "'s turn!");

        while (keepRolling) {
            // Slå spelarens tärning
            player.rollDice();

            // Hämta tärningens värde
            int diceValue = player.getDieValue();

            // Visa tärningsresultatet
            System.out.println("Dice rolled: " + diceValue);

            // Kontrollera om spelaren slog en etta
            if (diceValue == LOSING_ROLL) {
                turnPot = 0;
                System.out.println("OH NO! You rolled a 1 and lost your turn pot!");
            } else {
                // Lägg till tärningsvärdet i den tillfälliga potten
                turnPot += diceValue;

                // Visa aktuell pot och spelarens totalpoäng
                System.out.println("Turn pot: " + turnPot);
                System.out.println("Total score: " + player.getScore());

                int choice = input.readInt("Roll again (1) or Hold (2)? ", 1, 2);

                if (choice == 2) {
                    player.addScore(turnPot);
                    System.out.println("Banked " + turnPot + " points!");
                    System.out.println("Total score: " + player.getScore());
                    keepRolling = false;
                }
            }
        }
    }


    // TODO: Kontrollera om en spelare har vunnit
}
