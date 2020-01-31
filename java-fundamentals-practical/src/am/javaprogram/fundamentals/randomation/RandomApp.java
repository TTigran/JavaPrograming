package am.javaprogram.fundamentals.randomation;

import java.util.Scanner;

public class RandomApp {
    private static final Scanner SCANNER = new Scanner(System.in);
    private int [] arrayOfRandomNumber;

    /**
     * initializating arrayOfRandomNumber array  and  disaiding   size  in  constructor
     */
    public RandomApp() {
        int size = SCANNER.nextInt();
        arrayOfRandomNumber = new int[size];
    }

    /**
     * run  method for runing RandomApp
     */
    public void run() {
        generateArrayOfRandomNumber();
    }

    /**
     * generateArrayOfRandomNumber method for  generating  one  array  of interval betwen  min and max
     */
    private void generateArrayOfRandomNumber()  {
        System.out.println("Please enter min Number");
        int min = SCANNER.nextInt();
        System.out.println("Please enter max Number");
        int max = SCANNER.nextInt();
        int range = max - min + 1;
        // it's if for  min and max  scan  correctly
        if(max < min){
            throw new IllegalArgumentException("Max number "+max+" small from  min");
        }
        for(int i = 0; i < arrayOfRandomNumber.length ; i++) {
            int randomInt = (int)(Math.random()*range)+min;
            arrayOfRandomNumber[i]=(randomInt);
        }
    }
}
