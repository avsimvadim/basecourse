package week2;

import base.TaskUtils;

/**
 * 8. Посчитать сколько раз число 5 встречается в массиве. Результат вывести на экран (только число).
 *
 * {4, 19, 25, 5, 7, 9, 5, 17} -> 2
 * {7, 2, 15} -> 0
 *
 * В случае, если массив == null или длинна массива == 0 - на экран вывести null или {}.
 */
public class Task8 {
    public static void main(String[] args) {

        int[] array = TaskUtils.arrayConverter(args);

        if (array == null) {
            System.out.println("null");
        } else if (array.length == 0) {
            System.out.println("{}");
        } else {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 5) {
                    count++;
                }
            }
            System.out.println(count);
        }
        //        Yours code...

    }
}
