package am.javaprogram.genericdinamicarray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class GenericDynamicArray <T> {
    private final int DEFAULT_SIZE_OF_ARRAY = 10;
    private T array [];
    private int size;

    public GenericDynamicArray (T... arrayOfArguments) {
        this.array = Arrays.copyOf(arrayOfArguments, arrayOfArguments.length + 2);
        this.size = arrayOfArguments.length;
    }

    public GenericDynamicArray (Class<T> c) {
        final T[]a = (T[]) Array.newInstance(c,DEFAULT_SIZE_OF_ARRAY);
        this.array = a;
    }

    private void ensureSize() {
        if (size + 2 == array.length) {
            array = Arrays.copyOf(array, array.length + 2);
        }
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public int size() {
        return size;
    }

    public int indexOf(T element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public T[] removeById(int index) {
        for (int i = 0; i < array.length; i++) {
            if (i > index) {
                array[i - 1] = array[i];
            }
        }
        size--;
        System.out.println("size " + size);
        return array;
    }

    public void removeByElement(T element) {
        removeById(indexOf(element));
        System.out.println("size " + size);
    }

    public void add(T element) {
        ensureSize();
        array[size++] = element;
    }

    public void printArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
