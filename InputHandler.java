import java.util.Scanner;

public class InputHandler {
    private final Scanner scanner;

    // Konstruktor som skapar en Scanner
    public InputHandler() {
        scanner = new Scanner(System.in);
    }

    // TODO: Läs in ett heltal och kontrollera att det är giltigt
    // TODO: Kontrollera att heltalet ligger inom ett angivet intervall
    public int readInt(String prompt, int min, int max) {
        // TODO: implementera logik
        return 0;
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