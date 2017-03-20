
import java.util.Calendar;

public class Person {

  private String name;
  private MyDate birthday;

  public Person(String name, int pp, int kk, int vv) {
    this.name = name;
    this.birthday = new MyDate(pp, kk, vv);
  }

  public int age() {
// calculate the age based on the birthday and the current day
    // you get the current day as follows: 
    // Calendar.getInstance().get(Calendar.DATE);
    // Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
    // Calendar.getInstance().get(Calendar.YEAR);
    MyDate currentDate = new MyDate(Calendar.getInstance().get(Calendar.DATE), Calendar.getInstance().get(Calendar.MONTH) + 1, Calendar.getInstance().get(Calendar.YEAR));
    return currentDate.differneceInYears(birthday);

  }

  public boolean olderThan(Person compared) {
    if (this.age() > compared.age()) {
      return true;
    } else {
      return false;
    }
  }

  public String getName() {
    return this.name;
  }

  public String toString() {
    return this.name + ", born " + this.birthday;
  }
}
