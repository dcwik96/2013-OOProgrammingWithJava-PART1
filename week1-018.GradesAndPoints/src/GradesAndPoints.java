
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the points [0-60]: ");
        int num = Integer.parseInt(reader.nextLine());
        if (num >= 0 && num < 30) {
            System.out.println("Grade: failed");
        } else if (num >= 30 && num < 35) {
            System.out.println("Grade: 1");
        } else if (num >= 35 && num < 40) {
            System.out.println("Grade: 2");
        } else if (num >= 40 && num < 45) {
            System.out.println("Grade: 3");
        } else if (num >= 45 && num < 50) {
            System.out.println("Grade: 4");
        } else if (num >= 50 && num < 60) {
            System.out.println("Grade: 5");
        }
    }
}
