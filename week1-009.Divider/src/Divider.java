
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        double num1 = Double.parseDouble(reader.nextLine());
        System.out.print("Type another number: ");
        double num2 = Double.parseDouble(reader.nextLine());
        System.out.println("Division: " +num1+ " / " +num2+ " = " +(num1/num2));
        

        // Implement your program here. Remember to ask the input from user.
    }
}
