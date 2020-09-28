package am.javaprogram.loops;

public class GeometricFigure {
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

        for (int i = 0; i < 2 * size - 1; i++) {
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

        System.out.println("------------------------------------");

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size){
                    System.out.print("*  ");
                } else if (j == 1 || j == size){
                    System.out.print("*  ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        System.out.println("------------------------------------");

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size){
                    System.out.print("*  ");
                } else if (j == 1 || j == size){
                    System.out.print("*  ");
                } else if(j== size/2+1 || i== size/2+1){
                    System.out.print("*  ");
                } else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        System.out.println("------------------------------------");

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size){
                    System.out.print("*  ");
                } else if (j == 1 || j == size){
                    System.out.print("*  ");
                }else if(j == i){
                    System.out.print("*  ");
                } else if(j == size-i+1){
                    System.out.print("*  ");
                }  else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        System.out.println("------------------------------------");

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if(j == i){
                    System.out.print("*  ");
                }else if(j== size/2+1 || i== size/2+1){
                    System.out.print("*  ");
                }else if(j == size-i+1){
                    System.out.print("*  ");
                }   else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }
}
