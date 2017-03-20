
import java.util.Scanner;

public class TheSumBetweenTwoNumbers {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("First ");
    int num1 = Integer.parseInt(reader.nextLine());
    System.out.println("Second ");
    int num2 = Integer.parseInt(reader.nextLine());
    int i = num1;
    int sum = 0;
    while (i <= num2) {
      sum += i;
      i++;
    }
    System.out.println("Sum is " + sum);
  }
}
