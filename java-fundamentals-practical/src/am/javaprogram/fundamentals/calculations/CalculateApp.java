package am.javaprogram.fundamentals.calculations;

import java.util.Scanner;

public class CalculateApp {
  private static final Scanner SCANNER = new Scanner(System.in);
  private static final String EXIT_COMMAND = "exit";

  public void run() {
    calculateSum();
  }

  private int[] createArrayOfInputs() {
    System.out.println("Please  enter count of numbers");
    int countNumbers = SCANNER.nextInt();
    int[] arrayOfInputs = new int[countNumbers];
    for (int i = 0; i < arrayOfInputs.length; i++) {
      arrayOfInputs[i] = SCANNER.nextInt();
    }
    return arrayOfInputs;
  }

  private void calculateSum() {
    int[] arrayOfNumbers = createArrayOfInputs();
    int result = 0;
    for (int arrayOfNumber : arrayOfNumbers) {
      result += arrayOfNumber;
    }
    System.out.println(result);
  }
}
