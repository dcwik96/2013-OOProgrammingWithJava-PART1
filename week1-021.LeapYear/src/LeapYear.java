
import java.util.Scanner;

public class LeapYear {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.print("Type a year:");
    int num = Integer.parseInt(reader.nextLine());
    if (num%100 != 0) {
      if (num % 4 == 0) {
        System.out.println("The year is a leap year.");
      } else {
        System.out.println("The year is not a leap year.");
      }   
    } else if (num%100 == 0) {
      if (num%400 == 0) {
        System.out.println("The year is a leap year.");
      } else {
        System.out.println("The year is not a leap year.");
      }
    } else {
      System.out.println("The year is not a leap year.");
    }
   
  }
}
