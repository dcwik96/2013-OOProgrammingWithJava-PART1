
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dcwik
 */
public class Phonebook {

  private ArrayList<Person> book = new ArrayList<Person>();

  public void add(String name, String number) {
    Person addingPerson = new Person(name, number);
    book.add(addingPerson);
  }

  public void printAll() {
    for (Person p : book) {
      System.out.println(p);
    }
  }

  public String searchNumber(String name) {
    for (Person p : book) {
      if (p.getName().equals(name)) {
        return p.getNumber();
      }
    }
    String message = "number not known";
    return message;
  }
}
