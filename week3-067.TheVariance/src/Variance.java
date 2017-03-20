
import java.util.ArrayList;

public class Variance {

  // Copy here sum from exercise 63 
  public static int sum(ArrayList<Integer> list) {
    int sum = 0;
    for (Integer num : list) {
      sum += num;
    }
    return sum;
  }

  // Copy here average from exercise 64 
  public static double average(ArrayList<Integer> list) {
    double sum = sum(list);
    double avr = sum / list.size();
    return avr;
  }

  public static double variance(ArrayList<Integer> list) {
    double avr = average(list);
    double var = 0.0;
    double licznik = 0.0;
    for (int num : list) {
      licznik += ((double) (num) - avr)*((double) (num) - avr);
      System.out.println(licznik);
    }
    System.out.println(list.size());
    var = licznik / (list.size()-1);
    return var;
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(1);
//    list.add(3);
//    list.add(2);

    System.out.println("The variance is: " + variance(list));
  }

}
