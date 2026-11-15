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

        // Initiera spelare och spelinställningar
        ArrayList<Player> players = intitialize();

        // DEBUG: Testa att genomföra en omgång
        // takeTurn(players);

        // Spela valt antal omgångar
        for (int round = 1; round <= rounds; round++) {

            // Visa aktuell omgång
            System.out.println("\n===== 🎲 ROUND " + round + "/" + rounds + " 🎲 =====");

            // Låt alla spelare genomföra sitt kast
            takeTurn(players);
        }

        // Hitta och visa vinnare
        ArrayList<Player> winners = getWinners(players);

        System.out.println("\n===== 🏆 WINNER(S) 🏆 =====");

        for (Player winner : winners) {
            System.out.println(" - " + winner.getName() + " wins with " + winner.getScore() + " points!");
        }

        // Stäng InputHandler när spelet är färdigt
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

    // Låt alla spelare slå sina tärningar och samla poäng
    private static void takeTurn(ArrayList<Player> players) {

        // Gå igenom alla spelare i listan
        for (Player player : players) {

            // Visa vilken spelare som ska slå sina tärningar
            System.out.println("\n" + player.getName() + "'s turn!");

            // Rulla spelarens alla tärningar
            player.rollDice();

            // Hämta summan av tärningarnas värden
            int roundScore = player.getDiceTotal();

            // Lägg till summan i spelarens poäng
            player.addScore(roundScore);

            // Visa resultatet och spelarens uppdaterade poäng
            System.out.println("Round score: " + roundScore);
            System.out.println("Player score: " + player.getScore());
        }
    }

    // Returnera spelaren/spelarna med högst poäng
    private static ArrayList<Player> getWinners(ArrayList<Player> players) {
        // Skapa en lista för vinnarna
        ArrayList<Player> winners = new ArrayList<>();

        // Håll reda på den högsta poängen
        int highestScore = Integer.MIN_VALUE;

        // Gå igenom alla spelare
        for (Player player : players) {

            // Om spelaren har högre poäng än tidigare spelare
            if (player.getScore() > highestScore) {
                highestScore = player.getScore();

                // Töm listan eftersom vi hittat en ny högsta poäng
                winners.clear();
                winners.add(player);

            // Om spelaren har samma poäng som den högsta
            } else if (player.getScore() == highestScore) {
                winners.add(player);
            }
        }

        // Returnera alla spelare som delar den högsta poängen
        return winners;
    }

}
