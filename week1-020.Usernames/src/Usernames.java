
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your username: ");
        String user1 = reader.nextLine();
        System.out.print("Type your password: ");
        String pass1 = reader.nextLine();

        if (user1.equals("alex") && pass1.equals("mightyducks") || user1.equals("emily") && pass1.equals("cat")) {
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password was invalid");
        }
    }
}
