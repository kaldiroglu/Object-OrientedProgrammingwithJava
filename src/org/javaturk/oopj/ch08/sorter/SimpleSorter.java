package org.javaturk.oopj.ch08.sorter;

public abstract class SimpleSorter {

    public abstract void sort(int[] array);

    /**
     * Swaps the element given with leftIndex and rightIndex in the given array.
     * @param array
     * @param leftIndex
     * @param rightIndex
     */
    protected void swap(int[] array, int leftIndex, int rightIndex) {
        int temp = array[leftIndex];
        array[leftIndex] = array[rightIndex];
        array[rightIndex] = temp;
    }
}
