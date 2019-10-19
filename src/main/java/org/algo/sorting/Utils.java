package org.algo.sorting;

public class Utils {

    Utils(){
        // make constructor private
    }

    public  static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    public  static void exchange(Object[] a, int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public  static void show(Comparable[] a) {
        for (Comparable element : a) {
            System.out.print(element+" ");
        }
        System.out.println();
    }

    public static void print(String text){
        System.out.print(text);
    }

    public static void showPass(int pass,Comparable[] a){
        if(verbose()) {
            print("Pass " + (pass) + ":");
            show(a);
        }
    }

    public static boolean verbose(){
        return "true".equalsIgnoreCase(System.getProperty("verbose"));
    }

}
