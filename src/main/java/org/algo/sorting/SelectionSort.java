package org.algo.sorting;

import static org.algo.sorting.Utils.*;

public class SelectionSort {

    private static void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exchange(a, i, min);
            showPass(i + 1, a);
        }
    }


    public static void main(String[] args) {

        Comparable[] array = StdIn.readAllStrings();

        show(array);

        sort(array);

        show(array);
    }
}
