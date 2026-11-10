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

        // Tilldela spelaren en tärning (anropa addDie() med det angivna antalet sidor)

        // Skapa en loop som körs lika många gånger som antalet omgångar
        // Implementera spellogiken i Issue #3

        // TODO (Issue #3): Be spelaren gissa ett tal
        // TODO (Issue #3): Rulla spelarens tärning
        // TODO (Issue #3): Jämför gissningen med tärningens värde
        // TODO (Issue #3): Öka poängen om spelaren gissade rätt
        // TODO (Issue #3): Visa resultatet och spelarens poäng

        // VIKTIGT: Stäng Scanner när spelet är färdigt eftersom ingen mer inmatning behövs
        scanner.close();
    }
}
