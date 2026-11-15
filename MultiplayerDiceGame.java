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
        // TODO: Spela valt antal omgångar
        // TODO: Hitta och visa vinnare
    }

    // TODO: Läs in inställningar och skapa spelare
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

        // TODO: Skapa spelarna och tilldela deras tärningar 

        return players;
    }

    // TODO: Låt alla spelare slå sina tärningar och samla poäng

    // TODO: Returnera alla spelare med högst poäng


}
