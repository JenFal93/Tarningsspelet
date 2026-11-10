public class Player {

    private String name;
    private int score; 
    private Die die;


   public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Die die() {
        return die;
    }

    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.die = new Die(6);
    }

    public void setScore(int score) {
        this.score = score;
    }

}
