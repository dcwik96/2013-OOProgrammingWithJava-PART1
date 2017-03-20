
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);
    ArrayList<Bird> birdsList = new ArrayList<Bird>();

    while (true) {
      System.out.println("?");
      String command = reader.nextLine();

      if (command.equals("Add")) {
        System.out.println("Name: ");
        String name = reader.nextLine();
        System.out.println("Latin Name: ");
        String latinName = reader.nextLine();

        birdsList.add(new Bird(name, latinName));
      } 
      
      else if (command.equals("Observation")) {
        System.out.println("What was observed:?");
        String searchName = reader.nextLine();
        for (Bird b : birdsList) {
          if (b.getName().equals(searchName)) {
            b.Observation();
          } else {
            System.out.println("Is not a bird!");
          }
        }
      } 
      
      else if (command.equals("Statistics")) {
        for (Bird b : birdsList) {
          System.out.println(b);
        }
      } 
      
      else if (command.equals("Show")) {
        System.out.println("What?");
        String searchName = reader.nextLine();

        for (Bird b : birdsList) {
          if (b.getName().equals(searchName)) {
            System.out.println(b);
          } else {
            System.out.println("Is not a bird!");
          }
        }
      } 
      
      else if (command.equals("Quit")) {
        break;
      }

    }

  }

}
