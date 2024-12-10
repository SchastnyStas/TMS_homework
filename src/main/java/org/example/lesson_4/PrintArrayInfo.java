package org.example.lesson_4;

public class PrintArrayInfo {
    public static void main(String[] args) {
        int[] array = {-1, 0, 1, -9, 10, 11, 99, 100};
        int sum = 0;
        for (int j : array) {
            sum = sum + j;
        }
        int max = array[0];
        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }
        int min = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        System.out.println("Количество элементов = " + array.length);
        System.out.println("Сумма элементов = " + sum);
        System.out.println("Минимальный элемент = " + min);
        System.out.println("Максимальный элемент = " + max);
    }
}
