
import java.util.ArrayList;
import java.util.Scanner;
import jdk.nashorn.internal.ir.ForNode;

public class Main {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    ArrayList<Integer> gradesList = new ArrayList<Integer>();

    int grade = 0;
    double avg = 0.0;

    int counter1 = 0, counter2 = 0, counter3 = 0, counter4 = 0, counter5 = 0, counter6 = 0;

    System.out.println("Type exam scores, -1 completes:");

    while (grade != -1) {
      grade = Integer.parseInt(reader.nextLine());
      if (grade >= 0 && grade <= 60) {
        gradesList.add(grade);
      }
    }

    for (Integer i : gradesList) {
      if (i < 30) {
        counter1++;
      } else if (i >= 30 && i < 35) {
        counter2++;
      } else if (i >= 35 && i < 40) {
        counter3++;
      } else if (i >= 40 && i < 45) {
        counter4++;
      } else if (i >= 45 && i < 50) {
        counter5++;
      } else if (i >= 50 && i <= 60) {
        counter6++;
      }
    }

    avg = (double) (100 * (gradesList.size() - counter1)) / gradesList.size();

    System.out.println("Grade distribution:");
    
    System.out.print("5: ");
    for (int i = 0; i < counter6; i++) {
      System.out.print("*");
    }
    System.out.println("");
    
    System.out.print("4: ");
    for (int i = 0; i < counter5; i++) {
      System.out.print("*");
    }
    System.out.println("");
    
    System.out.print("3: ");
    for (int i = 0; i < counter4; i++) {
      System.out.print("*");
    }
    System.out.println("");
    
    System.out.print("2: ");
    for (int i = 0; i < counter3; i++) {
      System.out.print("*");
    }
    System.out.println("");
    
    System.out.print("1: ");
    for (int i = 0; i < counter2; i++) {
      System.out.print("*");
    }
    System.out.println("");
    
    System.out.print("0: ");
    for (int i = 0; i < counter1; i++) {
      System.out.print("*");
    }
    System.out.println("");
    System.out.println("Acceptance percentage: " + avg);

  }
}
