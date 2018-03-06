package week2;

/**
 * 11. Вычислить факториал числа. Если число меньше 0, вывести сообщение об ошибке ("Wrong number").
 *
 * 0! -> 1
 * 5! -> 120
 * 3! -> 6
 * -7! -> Wrong number
 */
public class Task11 {
    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);
        if (number < 0) {
            System.out.println("Wrong number");
        } else if (number != 0){
            int result = 1;
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            System.out.println(result);
        } else {
            System.out.println(1);
        }
        //        Yours code...

    }
}
