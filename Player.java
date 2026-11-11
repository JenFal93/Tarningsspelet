public class Player {

    // Instansvariabler 
    private String name;
    private int score; 
    private Die die;

    // Konstruktor som tar emot spelarens namn 
    public Player(String name) {
        this.name = name;
        this.score = 0;
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
        this.die = new Die(numberOfSides); // Den här tärningen är en ny tärning med x antal sidor 
    }

    // Rullar spelarens tärning 
    public void rollDice() {
        die.roll();
    }

    // Retunerar tärningens aktuella värde 
    public int getDieValue() {
        return die.getValue(); // Kallar på metoden getValue från Die-klassen 
    }

    // Ökar spelarens poäng med +1 
    public void increaseScore() {
        score ++; 
    }

}
