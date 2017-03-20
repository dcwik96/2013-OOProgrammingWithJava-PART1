import java.util.Random;

public class Dice {
    private Random random = new Random();
    private int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int roll() {
        // create here a random number belongig to range 1-numberOfSided
      int num = random.nextInt(this.numberOfSides);
      return num+1;
    }
}
