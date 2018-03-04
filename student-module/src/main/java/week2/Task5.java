package week2;

import base.TaskUtils;

/**
 * 5. Поменять местами наибольший и наименьший элементы в массиве и вывести его на экран в виде сообщения.
 * Если наименьший и наибольший элементы присутствуют в нескольких экземлярах, то поменять местами только те,
 * которые обладают наименьшим индексом в массиве.
 * Например "{1, 2, 1, 4, 5, 10, 7, 8, 9, 10}" -> "{10, 2, 1, 4, 5, 1, 7, 8, 9, 10}".
 * В случае, если массив == null или длинна массива == 0 - на экран вывести null или {}.
 */
public class Task5 {
    public static void main(String[] args) {

        int[] array = TaskUtils.arrayConverter(args);
        if (array == null) {
            System.out.println("null");
        } else if (array.length == 0) {
            System.out.println("{}");
        } else {
            int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
            int maxIndex = 0, minIndex = 0;
            for (int i = 1; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                    maxIndex = i;
                }
                if (min > array[i]) {
                    min = array[i];
                    minIndex = i;
                }
            }
                array[maxIndex] = min;
                array[minIndex] = max;
                System.out.print("{");
                for (int j = 0; j < array.length - 1; j++) {
                    System.out.print(array[j] + ", ");
                }
                System.out.println(array[array.length - 1] + "}");
        }
    }
}
