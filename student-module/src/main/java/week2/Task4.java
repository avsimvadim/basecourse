package week2;

import base.TaskUtils;

/**
 * 4. Найти минимальное и максимальное значения в массиве и вывести их на консоль.
 * Например "Min = 4, max = 46".
 * В случае, если массив == null или длинна массива == 0 - на экран вывести null или {}.
 */
public class Task4 {
    public static void main(String[] args) {

        int[] array = TaskUtils.arrayConverter(args);
        if (array == null) {
            System.out.println("null");
        } else if (array.length == 0) {
            System.out.println("{}");
        } else {
            int max = array[0], min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                }
                if (min > array[i]) {
                    min = array[i];
                }
            }
            System.out.println("Min = " + min + ", max = " + max);
        }
        //        Yours code...

    }
}
