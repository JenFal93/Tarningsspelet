import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        // Skapa ett Scanner-objekt för att läsa inmatning från terminalen
        Scanner scanner = new Scanner(System.in);

        // Visa ett välkomstmeddelande till spelaren
        System.out.println("========================================");
        System.out.println("         welcome to the game of         ");
        System.out.println("             🎲 D I C E 🎲               ");
        System.out.println("       - let's set up your game!        ");
        System.out.println("========================================");

        // Fråga hur många omgångar som ska spelas
        System.out.print("Number of rounds: ");
        // Läs in antalet omgångar o spara i en variabel
        int rounds = scanner.nextInt();

        // Fråga hur många sidor tärningen ska ha
        System.out.print("Number of dice sides: ");
        // Läs in antalet & spara i en variabel
        int numberOfSides = scanner.nextInt();
        scanner.nextLine(); // rensa kvarvarande radbrytning

        // Fråga efter spelarens namn
        System.out.print("Player name: ");
        // Läs in namnet och spara i en variabel
        String playerName = scanner.nextLine();

        // Skapa ett Player-objekt med spelarens namn (använd konstruktorn från Player.java)
        Player player = new Player(playerName); // anropar konstruktorn och skickar med namnet

        // Tilldela spelaren en tärning
        player.addDie(numberOfSides); // anropa addDie() med det angivna antalet sidor

        int round; // för att hålla koll på antalet rundor
        // Skapa en loop som körs lika många gånger som antalet omgångar
        for (round = 1; round <= rounds; round++) { // börjar omgång 1, fortsätter tills högst antalet valda omgångar, ökar varje omgång med 1

            // Visa vilken omgång som ska spelas
            System.out.println("\n======== 🎲 ROUND " + round + "/" + rounds + " =======");

            // Implementera spellogiken i Issue #3

            // Be spelaren gissa ett tal (inom tärningens möjliga värden)
            System.out.print("Enter your guess (1-" + numberOfSides + "): ");
            int guess = scanner.nextInt(); // spara gissningen i variabeln guess

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

            // TODO (Issue #3): Visa resultatet och spelarens poäng
        }

        // VIKTIGT: Stäng Scanner när spelet är färdigt eftersom ingen mer inmatning behövs
        scanner.close();
    }
}
