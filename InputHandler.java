import java.util.Scanner;

public class InputHandler {
    private final Scanner scanner;

    // Konstruktor som skapar en Scanner
    public InputHandler() {
        scanner = new Scanner(System.in);
    }

    // TODO: Läs in ett heltal och kontrollera att det är giltigt
    public int readInt(String prompt, int min, int max) {
        // Fortsätt fråga tills användaren anger ett giltigt heltal
        while (true) {
            // Visa frågan för användaren
            System.out.print(prompt);

            // Kontrollera att inmatningen är ett heltal (GILTIG)
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a whole number.");
                scanner.nextLine(); // läs bort ogiltig inmatning
                continue; // börja om loopen
            }

            // Läs in heltalet
            int number = scanner.nextInt();
            scanner.nextLine(); // läs bort kvarvarande radbrytning

            // Kontrollera att heltalet ligger inom angivet intervall
            if (number < min || number > max) {
                System.out.println("Please enter a number between " + min + " and " + max + ".");
                continue; // börja om loopen
            }

            // Returnera det giltiga heltalet
            return number;
        }
        
    }

    // TODO: Läs ett spelarnamn
    // TODO: Kontrollera att namnet inte är tomt eller enbart siffror
    public String readName(String prompt) {
        // TODO: implementera logik
        return "";
    }

    // Stäng Scanner när all inmatning är färdig
    public void close() {
        scanner.close();
    }
}