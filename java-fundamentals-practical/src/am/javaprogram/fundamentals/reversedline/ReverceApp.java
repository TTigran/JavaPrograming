package am.javaprogram.fundamentals.reversedline;

import java.util.Scanner;

public class ReverceApp {
    // fields  of  ReverceApp Class
    private static final Scanner scanner = new Scanner(System.in);
    private final String EXIT_COMMAND = "exit";

    // run method for running  ReverceApp's printing  proces
    public void run() {
        printReverse();
    }

    //toReverce method for Revercing process
    private String toReverce(String line){
        String result = "";
        for (int i = line.length()-1; i >= 0  ; i--) {
          result += line.charAt(i);
        }
        return result;
    }

    // printReverce method  for  printing ""reverse line""
    private void printReverse() {
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            if (EXIT_COMMAND.equalsIgnoreCase(line)) {
                System.out.println("Good By");
                scanner.close();
                break;
            } else {
                System.out.println(toReverce(line));
            }
        }
    }
}
