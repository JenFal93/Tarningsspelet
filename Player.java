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

    // Rullar spelarens tärning 

    // Retunerar tärningens aktuella värde 

    // Ökar spelarens poäng med +1 

}
