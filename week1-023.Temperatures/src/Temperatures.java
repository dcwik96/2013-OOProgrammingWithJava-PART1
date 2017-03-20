
import java.util.Scanner;

public class Temperatures {

  public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);
    // Write your code here. 
    double number;
    // Graph is used as follows:
    while (true) {
      number = Double.parseDouble(reader.nextLine());
      if (number < (-30) || number > 40) {
        System.out.println("");
      } else {
        Graph.addNumber(number);
      }
    }
    // Remove or comment out these lines above before trying to run the tests.
  }
}
