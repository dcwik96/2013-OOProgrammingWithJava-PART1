
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // write here the main program
    ArrayList<Student> list = new ArrayList<Student>();
    Scanner reader = new Scanner(System.in);
    String name = "";
    String number = "";
    while (true) {
      System.out.println("name: ");
      name = reader.nextLine();
      if (!name.equals("")) {
        System.out.println("studentnumber: ");
        number = reader.nextLine();
        list.add(new Student(name, number));
      } else {
        break;
      }
    }

    for (Student s : list) {
      System.out.println(s.toString());
    }

    System.out.println("Give search term: ");
    String search = reader.nextLine();
    System.out.println("Result: ");
    for (Student s : list) {
      if (s.getName().contains(search)) {
        System.out.println(s);
      }
    }
  }
}
