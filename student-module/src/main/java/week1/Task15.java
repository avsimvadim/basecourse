package week1;

/**
 * 15. Посчитать сколько раз встречается символ 5 в заданном числе (число трехкратное)
 *      435  -   1
 *      505  -   2
 *      555  -   3
 *      305  -   1
 */
public class Task15 {
    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);


        int counter = 0;

        int first = number%10;
        int second = (number / 10)%10;
        int third = number/100;

        if (first == 5) {
            counter++;
        }
        if (second == 5) {
            counter++;
        }
        if (third == 5) {
            counter++;
        }

        System.out.println(counter);

    }

}

