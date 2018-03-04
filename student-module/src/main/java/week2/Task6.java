package week2;

import base.TaskUtils;

import java.util.Arrays;

/**
 * 6. Вывести в консоль элементы той половины массива у которой среднее арифметическое максимальное.
 * Если длина массива - непарное число, то средний элемент не принимать в расчет.
 * Если среднее арифметическое половинок массива одинаковая, то вывести в консоль весь массив.
 * В случае, если массив == null или длинна массива == 0 - на экран вывести null или {}.
 *
 * {4, 19, 28, 25, 2, 9, 6, 17} -> {4, 19, 28, 25}
 * {7, 2, 15, 99, 12, 14, 18} -> {12, 14, 18}
 * {7, 2, 15, 99, 3, 14, 7} -> {7, 2, 15, 99, 3, 14, 7}
 */
public class Task6 {
    public static void main(String[] args) {

        int[] array = TaskUtils.arrayConverter(args);

        if (array == null) {
            System.out.println("null");
        } else if (array.length == 0) {
            System.out.println("{}");
        } else {

            double sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            System.out.println(sum / array.length);

        }
    }
}
