package am.javaprogram.fundamentals.calculations;

import java.util.Scanner;

public class CalculateApp {
  private static final Scanner SCANNER = new Scanner(System.in);

  /** run method for running calculate process in app. */
  public void run() {
    calculateSum();
  }

  /** createArrayOfInputs method create Array of inputted number */
  private int[] createArrayOfInputs() {
    System.out.println("Please  enter count of numbers");
    int countNumbers = SCANNER.nextInt();
    int[] arrayOfInputs = new int[countNumbers];
    for (int i = 0; i < arrayOfInputs.length; i++) {
      arrayOfInputs[i] = SCANNER.nextInt();
    }
    return arrayOfInputs;
  }

  /** calculateSum method for getting sum of this number in array */
  private void calculateSum() {
    int[] arrayOfNumbers = createArrayOfInputs();
    int result = 0;
    for (int arrayOfNumber : arrayOfNumbers) {
      result += arrayOfNumber;
    }
    System.out.println(result);
  }
}
