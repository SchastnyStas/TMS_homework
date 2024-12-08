package org.example.lesson_4;

public class ArraysDuplicates {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {3, 4, 5, 7, 9};

        for (int j : array2) {
            for (int i : array1) {
                if (j == i) {
                    System.out.println(i);
                }
            }
        }
    }
}
