package Lesson2.homework2;

import java.util.Arrays;

/**
 * @author Дмитрий
 */
public class Homework2 {

    public static void main(String[] args) {

        /* Задание №1 */
        int[] arr1 = {1, 1, 1, 0, 0, 0, 0, 0, 1, 1};
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 1 - arr1[i];
            // Вариант через if
//            if (arr [i] ==0) {
//                arr [i]= 1;
//            }else arr [i] = 0;
        }

        System.out.println(Arrays.toString(arr1));
        /* Задание №2/  Задать пустой целочисленный массив размером 8.
         С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;*/
        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
        }
        System.out.println(Arrays.toString(arr2));
        /* Задание №3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
         и числа меньшие 6 умножить на 2; */
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr3));

        printDiag(diagArr(9));
    }

    /* Задание №4  Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
     если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких
     элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     */
    // Создание массива:
    public static int[][] diagArr(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            arr[i][i] = 1;
            arr[i][n - 1 - i] = 1;
        }
        return arr;
    }

    // Распечатывание массива:
    public static void printDiag(int[][] diagArr) {
        for (int i = 0; i < diagArr.length; i++) {
            for (int j = 0; j < diagArr[i].length; j++) {
                System.out.print(diagArr[i][j] + " ");
            }
            System.out.println();
        }
    }
    /* Задание № 5 ** Задать одномерный массив и найти в нем минимальный и максимальный элементы
    (без помощи интернета);*/
    public static int maxValue(int[] arr5) {
        int max = arr5[0];
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] > max) {
                max = arr5[i];
            }
        }
        return max;
    }
}
