package am.javaprogram.sortalgoritm;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = {4, 7, 5, 78, 65, 45, 567, 6785, 2, 34, 1, 12345};

        // Bubble
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] ^= arr[j + 1];
                    arr[j + 1] ^= arr[j];
                    arr[j] ^= arr[j + 1];
                }
            }

        }
        System.out.println("Bubble");
        System.out.print("{ ");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length) {
                System.out.print(arr[i] + " ");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("}");

        //Selection
        int[] arr1 = {4, 7, 5, 78, 65, 45, 567, 432, 6785, 2, 34, 1};
        for (int i = 0; i < arr1.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[j] < arr1[minIndex])
                    minIndex = j;
            }
            int temp = arr1[minIndex];
            arr1[minIndex] = arr1[i];
            arr1[i] = temp;
        }
        System.out.println("Selection");
        System.out.print("{ ");
        for (int i = 0; i < arr1.length; i++) {
            if (i == arr1.length) {
                System.out.print(arr1[i] + " ");
            } else {
                System.out.print(arr1[i] + ", ");
            }
        }
        System.out.println("}");

        //Insertion
        int[] arr2 = {4, 7, 5, 78, 65, 45, 567, 432, 6785, 2, 34, 1};
        for (int i = 1; i < arr2.length; i++) {
            int key = arr2[i];
            int j = i - 1;
            while (j >= 0 && arr2[j] > key) {
                arr2[j + 1] = arr2[j];
                j = j - 1;
            }
            arr2[j + 1] = key;
        }

        System.out.println("Insertion");
        System.out.print("{ ");
        for (int i = 0; i < arr2.length; i++) {
            if (i == arr2.length) {
                System.out.print(arr2[i] + " ");
            } else {
                System.out.print(arr2[i] + ", ");
            }
        }
        System.out.println("}");


    }
}
