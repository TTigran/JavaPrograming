package fundamentals.calculatings;

import java.util.Scanner;

public class CalculatApp {
    // fields  of  CalculatApp Class
    private static final Scanner scanner = new Scanner(System.in);
    private final String EXIT_COMMAND = "exit";

    // run method for running  CalculatApp's printing  proces
    public void run() {
        calculatSum();
    }

    // creating array  for calculate sum  of that  numbers
    private int[] createArrayOfInputs(){
        System.out.println("Please  enter count of numbers");
        int countNumbers = scanner.nextInt();
        int [] arrayOfInputs = new int[countNumbers];
        for (int i = 0; i < arrayOfInputs.length ; i++) {
            arrayOfInputs[i] = scanner.nextInt();
        }
        return arrayOfInputs;
    }

    //calculat  sum  of thատ numbers
    private int calculatSum(){
        int [] arrayOfNumbers = createArrayOfInputs();
        int result = 0;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            result+=arrayOfNumbers[i];
        }
        System.out.println(result);
        return result;
    }
}
