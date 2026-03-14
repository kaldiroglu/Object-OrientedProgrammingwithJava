package org.javaturk.oopj.ch08.sorter;

public class InsertionSorter extends SimpleSorter {

    public void sort(int[] array) {
        int length = array.length;

        int tmp;

        for (int i = 1; i < length; i++) {
            tmp = array[i];
            for (int j = i; j >= 0; j--) {
                if (array[j] > tmp) { // Swap array[j] with tmp value
                    swap(array, j+1, j);
                    array[j] = tmp;
                }
            }
        }
    }
}
