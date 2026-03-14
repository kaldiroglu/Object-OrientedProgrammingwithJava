package org.javaturk.oopj.ch08.sorter;

public class BubbleSorter extends SimpleSorter {

    public void sort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j] > array[j + 1])
                    swap(array, j, j + 1);
            }
        }
    }
}
