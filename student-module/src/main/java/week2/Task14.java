package week2;

/**
 * 14. Проверить или является число простым.
 * Результат вывести в виде сообщения true/false.
 */
public class Task14 {
    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);
        boolean result = true;

        for (int i = 1; i < number - 1; i++) {
            if (number % (number - i) == 0) {
                result = false;
            }
        }

        if (result == false || number < 1) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
}
