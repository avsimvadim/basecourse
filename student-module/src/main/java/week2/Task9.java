package week2;

import base.TaskUtils;

/**
 * 9. Перевести положительное число с десятичной системы счисления в двоичную.
 * И вывести на экран в виде строки
 *
 * 8 -> 1000
 * 15 -> 1111
 */
public class Task9 {
    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);

        int[] array = new int[4];
        array[0] = 1;
        for (int i = 1; i < array.length; i++) {
          if (number % 2 == 0) {
              array[i] = 0;
          } else {
              array[i] = 1;
          }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
