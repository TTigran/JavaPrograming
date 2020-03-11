package am.javaprogram;

import java.util.Arrays;

public class DynamicList {
    private final int DEFAULT_SIZE_OF_ARRAY = 10;
    private int array[];
    private int size;

    private void ensureSize() {
        if (size + 2 == array.length) {
            array = Arrays.copyOf(array, array.length + 2);
        }
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int size() {
        return size;
    }

    public int[] removeById(int index) {
        for (int i = 0; i < array.length; i++) {
            if (i > index) {
                array[i-1] = array[i];
            }
        }
        size--;
        System.out.println("size " + size);
        return array;
    }

    public void removeByElement(int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > element) {
                removeById(i);
            }
        }
        size--;
        System.out.println("size " + size);
    }

    public  void addById( int element, int index) {
        int[] result = new int[array.length + 1];
        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if (i == index) {
                result[j] = element;
                j++;
            }
            result[j] = array[i];
        }
        size++;
        setArray(result);
    }

    public void add(int element) {
        ensureSize();
        array[size++]= element;
    }

    public void sort() {
        int arrayLength = array.length;
        int temp;
        for (int i = 0; i < arrayLength; i++) {
            for (int j = 1; j < (arrayLength - i); j++) {
                if (array[j - 1]> array[j]) {
                    temp = array[j - 1];
                    array[j - 1]= array[j];
                    array[j]= temp;
                }
            }
        }
    }

    public void printArray(){
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
