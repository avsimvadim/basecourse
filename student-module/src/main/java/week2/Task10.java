package week2;

import base.TaskUtils;

/**
 * 10. Перевести положительно число с двоичной системы счисления в десятичную.
 * Число будет переданно в виде массива (int[] number).
 * И вывести на экран.
 *
 * 1000 -> 8
 * 1111 -> 15
 */
public class Task10 {
    public static void main(String[] args) {

        int[] number = TaskUtils.arrayConverter(args);
        double result = 0.0;
        for (int i = 0; i < number.length; i++) {
            if ( number[number.length - 1 - i] == 1) {
                result += Math.pow(2,i);
            }
        }
        System.out.println((int)result);
    }
}
