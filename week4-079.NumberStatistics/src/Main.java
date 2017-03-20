
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    NumberStatistics statsAll = new NumberStatistics();
    NumberStatistics statsEven = new NumberStatistics();
    NumberStatistics statsOdd = new NumberStatistics();
    System.out.println("Type numbers:");

    int num = Integer.parseInt(reader.nextLine());
    while (num != -1) {
      if (num % 2 == 0) {
        statsEven.addNumber(num);
        statsAll.addNumber(num);
      } else {
        statsOdd.addNumber(num);
        statsAll.addNumber(num);
      }
      num = Integer.parseInt(reader.nextLine());
    }

    System.out.println("sum: " + statsAll.sum());
    System.out.println("sum of even: " + statsEven.sum());
    System.out.println("sum of odd: " + statsOdd.sum());

  }
}
