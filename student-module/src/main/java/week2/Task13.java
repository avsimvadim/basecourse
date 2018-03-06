package week2;

/**
 * 13. Последовательность Фибоначчи определяется так:
 *
 * φ0=0,  φ1=1, ..., φn=φn-1+φn-2.
 *
 * По данному числу n определите n-е число Фибоначчи φn и вывести его на экран.
 * Число будет >= 0.
 *
 * φ7 -> 13
 * φ10 -> 55
 */
public class Task13 {
    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);

        if (number == 0) {
            System.out.println("0");
        } else if (number == 1) {
            System.out.println("1");
        } else {
            int[] array = new int[number + 1];
            array[0] = 0;
            array[1] = 1;
            for (int i = 2; i <= number; i++) {
                array[i] = array[i - 1] + array[i - 2];
            }
            System.out.println(array[number]);
        }
    }
}
