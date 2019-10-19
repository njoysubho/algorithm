package org.algo.sorting;

import static org.algo.sorting.Utils.*;

public class InsertionSort {

    private static void sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {

            for(int j=i;j>0;j--){
                if(less(a[j],a[j-1])){
                    exchange(a,j,j-1);
                }
            }
            showPass(i,a);
        }
    }


    public static void main(String[] args) {

        Comparable[] array = StdIn.readAllStrings();

        show(array);

        sort(array);

        show(array);
    }
}
