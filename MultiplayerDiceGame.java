import java.util.ArrayList;

public class MultiplayerDiceGame {

    // Konstanter för tillåtna gränsvärden
    private static final int MIN_PLAYERS = 2;
    private static final int MAX_PLAYERS = 10;

    private static final int MIN_DICE = 1;
    private static final int MAX_DICE = 10;
    
    private static final int MIN_ROUNDS = 1;
    private static final int MAX_ROUNDS = 100;

    private static final int DICE_SIDES = 6; // satt antal sidor

    // Antalet omgångar behöver vara tillgängligt i main
    private static int rounds;

    // Skapa ett InputHandler-objekt för att läsa inmatning från terminalen
    private static final InputHandler input = new InputHandler(); // kan användas av main() och initialize()

    
    public static void main(String[] args) {
        
        // TODO: Initiera spelare och spelinställningar
        
        // DEBUG: kontrollera att spelarna skapas
        ArrayList<Player> players = intitialize();
        for (Player player : players) {
            System.out.println("Created player: " + player.getName());
        }

        // TODO: Spela valt antal omgångar
        // TODO: Hitta och visa vinnare
        input.close();
    }

    // Läs in inställningar och skapa spelare
    private static ArrayList<Player> intitialize() {

        // Skapa en lista som ska innehålla alla spelare
        ArrayList<Player> players = new ArrayList<>();

        // Läs in antalet spelare
        int numberOfPlayers = input.readInt(
            "Number of players (" + MIN_PLAYERS + "-" + MAX_PLAYERS + "): ", MIN_PLAYERS, MAX_PLAYERS
        );

        // Läs in antalet tärningar per spelare
        int numberOfDice = input.readInt(
            "Dice per player (" + MIN_DICE + "-" + MAX_DICE + "): ", MIN_DICE, MAX_DICE
        );

        // Läs in antalet omgångar
        rounds = input.readInt(
            "Number of rounds (" + MIN_ROUNDS + "-" + MAX_ROUNDS + "): ", MIN_ROUNDS, MAX_ROUNDS
        );

        // Skapa spelarna och tilldela deras tärningar
        for (int i = 1; i <= numberOfPlayers; i++) {

            // Fråga efter spelarens namn
            String playerName = input.readName("Player " + i + " name: ");

            // Skapa ett nytt Player-objekt
            Player player = new Player(playerName);

            // Tilldela spelaren det valda antalet tärningar
            for (int j = 0; j <= numberOfDice; j++) {
                player.addDie(DICE_SIDES);
            }

            // Lägg till spelaren i listan
            players.add(player);
        }

        return players;
    }

    // TODO: Låt alla spelare slå sina tärningar och samla poäng

    // TODO: Returnera alla spelare med högst poäng


}
