import java.util.Scanner;

public class InputHandler {
    private final Scanner scanner;

    // Konstruktor som skapar en Scanner
    public InputHandler() {
        scanner = new Scanner(System.in);
    }

    // Läs in ett heltal och kontrollera att det är giltigt
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

    // Läs ett spelarnamn, kontrollera att namnet inte är tomt eller enbart siffror
    public String readName(String prompt) {
        // Fortsätt fråga tills att användaren anger ett giltigt namn
        while (true) {
            // Visa frågan för användaren
            System.out.print(prompt);

            // Läs in namnet och ta bort mellanslag i början och slutet
            String name = scanner.nextLine().trim();

            // Kontrollera att namnet inte är tomt
            if (name.isEmpty()) {
                System.out.println("Name cannot be empty.");
                continue; // börja om loopen
            }

            // Kontrollera att namnet inte enbart består av siffror
            if (name.matches("\\d+")) { // reguljärt uttryck \\d betyder siffra och + betyder en eller flera
                System.out.println("Name cannot contain only numbers.");
                continue; // börja om loopen
            }

            // Returnera namnet när det är giltigt
            return name;
        }
    }

    // Stäng Scanner när all inmatning är färdig
    public void close() {
        scanner.close();
    }
}
