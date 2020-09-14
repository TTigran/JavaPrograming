package am.javaprogram.loops;

public class GeometricForm {
    public static void main(String[] args) {
        int size = 5;

        for (int i = 0; i <= size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("------------------------------------");

        for (int i = 0; i <= size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("------------------------------------");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println("------------------------------------");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < size - i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }


        System.out.println("------------------------------------");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println("------------------------------------");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            for (int j = 2 * (size - (i + 1) + 1); j > 1; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println("------------------------------------");

        for (int i = 0; i < size + 4; i++) {
            if (i < size) {
                for (int j = 0; j < size - i - 1; j++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 0; j < i - size + 1; j++) {
                    System.out.print("  ");
                }

                for (int j = 2 * (size - ((i - size + 1) + 1) + 1); j > 1; j--) {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }
}
