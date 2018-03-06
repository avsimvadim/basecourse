package week2;

/**
 * 12. Посчитать сколько раз встречается символ 8 в заданном числе (размер числа - нефиксированый, но >= 0)
 *      5678  -   1
 *      5889  -   2
 *      8888  -   4
 *      989990  - 1
 */
public class Task12 {
    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);

        int size = 0;
        if (number != 0) {
            for (int i = 0; ; i++) {
                if (number / Math.pow(10, i) >= 1) {
                    size++;
                } else {
                    break;
                }
            }
        } else {
            size = 1;
        }

        int result = 0;
        if (size == 1 && number % 10 == 8) {
                result++;
        } else {
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = (int)((number / Math.pow(10,i)) % 10);
            }
            for (int i = 0; i < size; i++) {
                if (array[i] == 8) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
