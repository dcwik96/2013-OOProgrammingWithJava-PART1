
import java.util.Scanner;

public class LoopsEndingRemembering {

  public static void main(String[] args) {
    // program in this project exercises 36.1-36.5
    // actually this is just one program that is split in many parts

    Scanner reader = new Scanner(System.in);
    int num = 0;
    int sum = 0;
    int counter = 0;
    double avr = 0.0;
    int odd = 0, even = 0;
    System.out.println("Type number: ");
    num = Integer.parseInt(reader.nextLine());
    while (num != (-1)) {
      if (num % 2 == 0) {
        even++;
      } else {
        odd++;
      }
      counter++;
      sum = sum + num;
      num = Integer.parseInt(reader.nextLine());
    }
    avr = ((double)(sum) / (double)(counter));
    System.out.println("Thank you and see you later!");
    System.out.println("The sum is " + sum);
    System.out.println("How many numbers: " + counter);
    System.out.println("Average: " + avr);
    System.out.println("Even numbers: " + even);
    System.out.println("Odd numbers: " + odd);
  }
}
