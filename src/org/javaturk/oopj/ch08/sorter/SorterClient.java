package org.javaturk.oopj.ch08.sorter;

public class SorterClient {

    private SimpleSorter sorter;

    public void startSorting() {
        int[] array = {718, 23, 116, 884, 290, 611, 418, 532, 997};

        sorter = new InsertionSorter();
        System.out.println("Using InsertionSorter:");
        sorter.sort(array);
        print(array);

        sorter = new BubbleSorter();
        System.out.println("Using BubbleSorter:");
        sorter.sort(array);
        print(array);

        sorter = new SelectionSorter();
        System.out.println("Using SelectionSorter:");
        sorter.sort(array);
        print(array);
    }

    private void print(int[] array) {
        System.out.println("Array:");
        for (int i : array)
            System.out.println(i);
        System.out.println();
    }
}
