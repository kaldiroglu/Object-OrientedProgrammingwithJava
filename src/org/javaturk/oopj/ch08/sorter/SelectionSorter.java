package org.javaturk.oopj.ch08.sorter;

public class SelectionSorter extends SimpleSorter {

    public void sort(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            int lowestIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (array[j] < array[lowestIndex])
                    lowestIndex = j;
            }
            // Swap only when the lowestIndex is not i, in which case ith index already the index of lowest number.
            if (lowestIndex != i)
                swap(array, lowestIndex, i);
        }
    }
}
