import java.util.ArrayList;

public class Player {

    // Instansvariabler 
    private String name;
    private int score; 
    private ArrayList<Die> dice; // en ArrayList låter oss lagra flera Die-objekt i samma spelare

    // Konstruktor som tar emot spelarens namn 
    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.dice = new ArrayList<>(); // varje spelare har en egen, tom lista med tärningar när objektet skapas
    }
  
   public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    // Uppdaterar spelarens poäng 
    public void setScore(int score) {
        this.score = score;
    }

    // Skapa en tärning med angivet antal sidor och tilldela den till spelaren 
    public void addDie(int numberOfSides) {
        //this.die = new Die(numberOfSides); // Den här tärningen är en ny tärning med x antal sidor 
        dice.add(new Die(numberOfSides)); // lägg till nya tärningar i listan
    }

    // Rullar spelarens tärningar
    public void rollDice() {
        for (Die die : dice) {
            die.roll();
        }
    }

    // Retunerar värdet från spelarens första tärning för att behålla kompatibiliteten med enspelarläget
    public int getDieValue() {
        return dice.get(0).getValue(); // Kallar på metoden getValue från Die-klassen 
    }

    // Returnerar summan av spelarens alla tärningsvärden
    public int getDiceTotal() {
        int total = 0;

        for (Die die : dice) {
            total += die.getValue();
        }

        return total;
    }

    // Ökar spelarens poäng med +1 
    public void increaseScore() {
        score++; 
    }

}
