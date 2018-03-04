package week1;

/**
 * 12. Определить, является ли шестизначное число "счастливым" (сумма первых трех цифр равна сумме последних трех цифр).
 * Ответ вывести в виде сообщения true/false.
 */
public class Task12 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int first = number % 10;
        int second = ( number / 10 ) % 10;
        int third = ( number / 100 ) % 10;
        int fourth = ( number / 1000 ) % 10;
        int fifth = ( number / 10000 ) % 10;
        int sixth = number / 100000;
        boolean result = ( first + second + third ) == ( fourth + fifth + sixth );
        System.out.println(result);
        //      Yours code...

    }
}
