import java.util.Random; // Importerar Random för att kunna slumpa fram tal

public class Die {

   // Instansvariabler som beskriver tärningen
   private int value; // Tärningens nuvarande värde
   private int numberOfSides; // Tärningens antal sidor
   private Random random; // Slumpgenerator som används vid tärningskast

   // Konstruktor som anger tärningens antal sidor och skapar en slumpgenerator 
   public Die(int numberOfSides) {

        this.numberOfSides = numberOfSides;
        this.random = new Random();
   }

   // Returnerar tärningens nuvarande värde 
   public int getValue() {
        return value;
   }

   // Returnerar tärningens antal sidor
   public int getNumberOfSides() {
        return numberOfSides;
   }

   // Slumpar fram ett nytt tärningsvärde mellan 1 och antalet sidor 
   public void roll() {
        this.value = random.nextInt(numberOfSides) + 1;
   }

}
