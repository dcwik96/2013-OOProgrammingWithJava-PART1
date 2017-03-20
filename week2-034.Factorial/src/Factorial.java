
import java.util.Scanner;

public class Factorial {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Type a number: ");
    int num = Integer.parseInt(reader.nextLine());
    int factorial = 1;
    if (num == 0) {
      System.out.println("Factorial is " + factorial);
    } else {
      int i = 1;
      while (i <= num) {
        factorial = factorial * i;
        i++;
      }
      System.out.println("Factorial is " + factorial);
    }

  }
}
