
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the radius:");
        int radius = Integer.parseInt(reader.nextLine());
        double wynik = 2*radius*Math.PI;
        System.out.println("Circumference of the circle: " + wynik);
        // Program your solution here 
    }
}
