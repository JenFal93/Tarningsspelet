public class DiceGame {
    // Konstanter för tillåtna gränsvärden vid inmatning
    private static final int MIN_ROUNDS = 1;
    private static final int MAX_ROUNDS = 100;
    private static final int MIN_DICE_SIDES = 2;
    private static final int MAX_DICE_SIDES = 20;
    private static final int MIN_GUESS = 1;

    public static void main(String[] args) {

        // Skapa ett InputHandler-objekt för att läsa inmatning från terminalen
        InputHandler input = new InputHandler();

        // Visa ett välkomstmeddelande till spelaren
        System.out.println("========================================");
        System.out.println("         welcome to the game of         ");
        System.out.println("             🎲 D I C E 🎲               ");
        System.out.println("       - let's set up your game!        ");
        System.out.println("========================================");

        // Använd InputHandler() – fråga hur många omgångar som ska spelas, läs in antalet, spara i en variabel
        int rounds = input.readInt("Number of rounds (" + MIN_ROUNDS + "-" + MAX_ROUNDS + "): ", MIN_ROUNDS, MAX_ROUNDS);

        // Använd InputHandler() - fråga om hur många sidor tärningen ska ha, läs in antalet, spara i en variabel
        int numberOfSides = input.readInt("Number of dice sides (" + MIN_DICE_SIDES + "-" + MAX_DICE_SIDES + "): ", MIN_DICE_SIDES, MAX_DICE_SIDES);

        // Använd InputHandler() - fråga om spelarens namn, läs in namnet, spara i en variabel
        String playerName = input.readName("Player name: ");

        // Skapa ett Player-objekt med spelarens namn (använd konstruktorn från Player.java)
        Player player = new Player(playerName); // anropar konstruktorn och skickar med namnet

        // Tilldela spelaren en tärning
        player.addDie(numberOfSides); // anropa addDie() med det angivna antalet sidor

        int round; // för att hålla koll på antalet rundor
        
        // Skapa en loop som körs lika många gånger som antalet omgångar
        for (round = 1; round <= rounds; round++) { // börjar omgång 1, fortsätter tills högst antalet valda omgångar, ökar varje omgång med 1

            // Visa vilken omgång som ska spelas
            System.out.println("\n======== 🎲 ROUND " + round + "/" + rounds + " =======");

            // Använd InputHandler() - kontrollera range, spara gissningen i variabeln guess
            int guess = input.readInt("Enter your guess (" + MIN_GUESS + "-" + numberOfSides + "): ", MIN_GUESS, numberOfSides);

            // Rulla spelarens tärning
            player.rollDice();
            // Hämta tärningens aktuella värde
            int dieValue = player.getDieValue();
            // Visa resultatet av tärningsspelet
            System.out.println("You rolled a " + dieValue + "!");

            // Jämför gissningen med tärningens värde
            if (guess == dieValue) {
                // Öka poängen om spelaren gissade rätt
                player.increaseScore();
                System.out.println("Correct guess!");
            } else {
                // Ingen poäng vid fel gissning
                System.out.println("Incorrect guess. Better luck next round!");
            }

            // Visa resultatet och spelarens poäng
            System.out.println("Player score: " + player.getScore());
        }

        // VIKTIGT: Stäng Scanner när spelet är färdigt eftersom ingen mer inmatning behövs
        input.close();
    }
}
