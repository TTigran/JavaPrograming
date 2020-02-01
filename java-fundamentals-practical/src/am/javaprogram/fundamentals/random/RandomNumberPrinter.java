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
    generateArrayOfRandomNumber();
  }

  /** generateArrayOfRandomNumber method for generating one array of interval betwen min and max */
  private void generateArrayOfRandomNumber() {
    Random random = new Random();
    System.out.println("Please enter min Number");
    int min = SCANNER.nextInt();
    System.out.println("Please enter max Number");
    int max = SCANNER.nextInt();
    int range = max - min + 1;
    if (max < min) {
      throw new IllegalArgumentException("Max number " + max + " smaller from  min");
    }
    for (int i = 0; i < arrayOfRandomNumber.length; i++) {
      int randomInt = (random.nextInt() * range) + min;
      arrayOfRandomNumber[i] = randomInt;
    }
  }
}
