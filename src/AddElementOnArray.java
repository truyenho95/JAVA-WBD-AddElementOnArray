import java.util.Arrays;
import java.util.Scanner;

public class AddElementOnArray {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Bạn muốn nhập bao nhiêu phần tử của mảng:");
    int size = scanner.nextInt();

    int[] numberArray = new int[size];

    assignValueForElementInArray(numberArray);
    printArray(numberArray);

    System.out.println("Bạn muốn thêm bao nhiêu phần tử của mảng:");
    int numberOfAddingElement = scanner.nextInt();

    int[] newArray = addElement(numberArray, numberOfAddingElement);
    printArray(newArray);
  }

  public static void assignValueForElementInArray (int[] array) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Mời nhập giá trị cho các phần tử của mảng:");
    for (int i = 0; i < array.length; i++) {
      System.out.print("element["+i+"] = ");
      array[i] = scanner.nextInt();
    }
  }

  public static void printArray(int[] array) {
    System.out.println("Mảng hiện tại là:");
    System.out.println(Arrays.toString(array));
  }

  public static int[] addElement(int[] array, int numberOfAddingElement) {
    Scanner scanner = new Scanner(System.in);
    int[] newArray = new int[array.length + numberOfAddingElement];
    for (int i = 0; i < newArray.length; i++) {
      if (i<array.length) {
        newArray[i] = array[i];
      } else {
        System.out.print("element["+i+"] = ");
        newArray[i] = scanner.nextInt();
      }
    }
    return newArray;
  }
}
