
public class Main {

  public static int smallest(int[] array) {
    int smallest = array[0];
    for (int i = 0; i < array.length; i++) {
      if (smallest >= array[i]) {
        smallest = array[i];
      }
    }
    return smallest;
  }

  public static int indexOfTheSmallest(int[] array) {
    int index = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[index] >= array[i]) {
        index = i;
      }
    }
    return index;
  }

  public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
    int search = index;
    for (int i = index; i < array.length; i++) {
      if (array[search] >= array[i]) {
        search = i;
      }
    }
    return search;
  }

  public static void swap(int[] array, int index1, int index2) {
    int temp = 0;
    temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
  }

  public static void sort(int[] array) {
    for (int i = 0; i < array.length; i++) {
      swap(array,indexOfTheSmallestStartingFrom(array, i),i);
    }
  }

  public static void main(String[] args) {
    // write testcode here

  }

}
