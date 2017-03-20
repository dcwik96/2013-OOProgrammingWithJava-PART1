
public class PrintingLikeBoss {

  public static void printWhitespaces(int size) {
    for (int i = 0; i < size; i++) {
      System.out.print(" ");
    }
  }

  // copy or rewrite the method of Assignment 39.1 here
  public static void printStars(int amount) {
    // 39.1
    // you can print one star with the command
    for (int i = 0; i < amount; i++) {
      System.out.print("*");
    }
    System.out.println();// call this command amount times        
  }

  public static void printTriangle(int size) {
    // 39.4
    for (int i = 1; i <= size; i++) {
      printWhitespaces(size - i);
      printStars(i);
    }
  }

  public static void xmasTree(int height) {
    // 40.3
    for (int i = 1; i <= height; i++) {
      printWhitespaces(height - i);
      printStars(i * 2 - 1);
    }
    
//    stand
    for (int i = 1; i <= 2; i++) {
      printWhitespaces(height - 2);
      printStars(3);
    }
  }

  public static void main(String[] args) {
    // Tests do not use main, yo can write code here freely!

    printTriangle(5);
    System.out.println("---");
    xmasTree(4);
    System.out.println("---");
    xmasTree(10);
  }
}
