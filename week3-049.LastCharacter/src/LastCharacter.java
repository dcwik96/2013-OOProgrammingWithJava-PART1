import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        char letter = lastCharacter(name);
        System.out.println("Last character: " + letter);
    }
    
    public static char lastCharacter(String name){
      int len = name.length();
      char letter = name.charAt(len-1);
      return letter;
    }
}
