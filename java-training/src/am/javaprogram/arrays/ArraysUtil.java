package am.javaprogram.arrays;

public class ArraysUtil {
    public static void main(String[] args) {
        int defaultSize = 10;

        int[] numbers = new int[defaultSize];
        System.out.print("{ ");
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = i;
            if (i == numbers.length - 1) {
                System.out.print(i + " ");
            } else {
                System.out.print(i + " , ");
            }
        }
        System.out.println("}");

        System.out.println();
        System.out.println();

        int progressNumber = 5;
        int[] numbers1 = new int[defaultSize * 2];

        System.out.print("{ ");
        for (int i = 0; i < numbers1.length; i++) {
            int element = i * progressNumber;
            numbers1[i] = element;
            if (i == numbers1.length - 1) {
                System.out.print(element + " ");
            } else {
                System.out.print(element + " , ");
            }
        }
        System.out.print("}");

        System.out.println();
        System.out.println();

        int[][] numbers2 = new int[defaultSize / 2][defaultSize / 2];
        System.out.println("{ ");
        for (int i = 0; i < numbers2.length; i++) {
            System.out.print("{ ");
            for (int j = 0; j < numbers2[i].length; j++) {
                int element = j + i * defaultSize / 2 + 1;
                numbers2[i][j] = element;

                if (j == numbers2[i].length - 1) {
                    System.out.print(element + " ");
                } else {
                    System.out.print(element + " , ");
                }
            }

            if (i == numbers2.length - 1) {
                System.out.print("}");
            } else {
                System.out.print("},");
            }

            System.out.println();
        }
        System.out.print("}");

        System.out.println();
        System.out.println();

        int progressNumber1 = 10;
        int[] numbers3 = new int[defaultSize * 10];

        System.out.print("{ ");
        for (int i = 0; i < numbers3.length; i++) {
            int element = i * progressNumber1;
            numbers3[i] = element;
            if (i == numbers3.length - 1) {
                System.out.print(element + " ");
            } else {
                System.out.print(element + " , ");
            }
        }
        System.out.print("}");

        System.out.println();
        System.out.println();

        double sum = 0.0;
        int[] numbers4 = new int[defaultSize * 10 / 2];

        System.out.print("{ ");
        for (int i = 0; i < numbers4.length; i++) {
            int element = i;
            numbers4[i] = element;
            sum += element;
            if (i == numbers4.length - 1) {
                System.out.print(element + " ");
            } else {
                System.out.print(element + " , ");
            }
        }
        System.out.println("}");
        System.out.println(" sum = " + sum);

        System.out.println();
        System.out.println();

        int[][] numbers5 = new int[defaultSize / 2 - 1][defaultSize / 2 - 1];
        System.out.println("{ ");
        for (int i = 0; i < numbers5.length; i++) {
            System.out.print("{ ");
            for (int j = 0; j < numbers5[i].length; j++) {
                int element = (j + i * defaultSize / 2 + 1) * 2;
                numbers5[i][j] = element;

                if (j == numbers5[i].length - 1) {
                    System.out.print(element + " ");
                } else {
                    System.out.print(element + " , ");
                }
            }
            if (i == numbers2.length - 1) {
                System.out.print("}");
            } else {
                System.out.print("},");
            }

            System.out.println();
        }
        System.out.print("}");

        System.out.println();
        System.out.println();

        int[][][] numbers6 = new int[defaultSize / 2][defaultSize / 2][defaultSize / 2];
        System.out.println("{ ");
        for (int i = 0; i < numbers6.length; i++) {
            System.out.print("{ ");
            for (int j = 0; j < numbers6[i].length; j++) {
                System.out.print("{ ");
                for (int k = 0; k < numbers6[i][j].length; k++) {

                    int element = (k + (j * defaultSize / 2) + (i * defaultSize / 2 * defaultSize / 2) + 1) * 3;
                    numbers6[i][j][k] = element;

                    if (k == numbers6[i][j].length - 1) {
                        System.out.print(element + " ");
                    } else {
                        System.out.print(element + " , ");
                    }
                }

                if (j == numbers2.length - 1) {
                    System.out.print("}");
                } else {
                    System.out.print("},");
                }

                System.out.println();
            }

            if (i == numbers2.length - 1) {
                System.out.print("}");
            } else {
                System.out.print("},");
            }

            System.out.println();
        }
        System.out.print("}");

        System.out.println();
        System.out.println();

        int[] numbers7 = {5, 748, 1254, 698, 2, 24};
        int max = numbers7[0];
        for (int i = 1; i < numbers7.length; i++) {
            if (max < numbers7[i]) {
                max = numbers7[i];
            }

        }
        System.out.println("max = " + max);

        System.out.println();
        System.out.println();

        int[] numbers8 = {5, 748, 1254, 698, 2, 24};
        int min = numbers8[0];
        for (int i = 1; i < numbers8.length; i++) {
            if (min > numbers8[i]) {
                min = numbers8[i];
            }
        }
        System.out.println("min = " + min);
    }
}
