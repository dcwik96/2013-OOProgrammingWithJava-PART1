
import java.util.Scanner;
import sun.security.util.Length;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int letters = calculateCharacters(name);
        System.out.println("Number of characters: " + letters);
    }
    
    // do here the method
     public static int calculateCharacters(String name){
       int letters;
       letters = name.length();
       return letters;
     }
    
}
