
import java.util.Random;

public class PasswordRandomizer {

  // Define the variables
  private int length;
  private Random random = new Random();

  public PasswordRandomizer(int length) {
    // Initialize the variable
    this.length = length;
  }

  public String createPassword() {
    // write code that returns a randomized password
    String pass = "";
    for (int i = 0; i < this.length; i++) {
      int randomNum = random.nextInt(25);
      char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(randomNum);
      pass += symbol;
    }
    return pass;
  }
}
