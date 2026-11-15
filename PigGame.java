public class PigGame {

    // TODO: Konstanter för spelregler och tillåtna gränsvärden
    private static final int MIN_PLAYERS = 2;
    private static final int MAX_PLAYERS = 10;

    private static final int DICE_SIDES = 6; // satt antal sidor

    private static final int WINNING_SCORE = 100;
    private static final int LOSING_ROLL = 1; // förlorar tillfällig pott

    // Skapa ett InputHandler-objekt för att läsa inmatning från terminalen
    private static final InputHandler input = new InputHandler(); // kan användas av main() och initialize()

    public static void main(String[] args) {

        // TODO: Initiera spelare och spelinställningar
        // TODO: Starta spelets turordning
        // TODO: Avsluta spelet när en spelare når 100 poäng

        // Stäng InputHandler när spelet är färdigt
        input.close();
    }
    
    // TODO: Skapa spelarna och tilldela varsin 6-sidig tärning
    // TODO: Hantera en spelares tur och tillfälliga pott
    // TODO: Kontrollera om en speare har vunnit
}
