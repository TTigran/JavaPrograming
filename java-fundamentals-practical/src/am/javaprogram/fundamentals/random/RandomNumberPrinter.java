package am.javaprogram.fundamentals.random;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberPrinter {
  private static final Scanner SCANNER = new Scanner(System.in);
  private int[] arrayOfRandomNumber;

  /** initializing arrayOfRandomNumber array and deciding size in constructor */
  public RandomNumberPrinter() {
    int size = SCANNER.nextInt();
    arrayOfRandomNumber = new int[size];
  }

  /** run method for running RandomApp */
  public void run() {
    printerArray();
  }

  /** getRangeByMinMax method for get Range */
  private int getRangeByMinMax(int min, int max) {
    Random r = new Random();
    return r.nextInt((max - min) + 1) + min;
  }

  /** generateArrayOfRandomNumber method for generating one array of interval between min and max */
  private int[] generateArrayOfRandomNumber() {
    for (int i = 0; i < arrayOfRandomNumber.length; i++) {
      arrayOfRandomNumber[i] = getRangeByMinMax(10, 100);
    }
    return arrayOfRandomNumber;
  }

  /** printerArray method print generated array of random numbers */
  private void printerArray() {
    int[] randoms = generateArrayOfRandomNumber();
    for (int random : randoms) {
      System.out.println(random);
    }
  }
}
