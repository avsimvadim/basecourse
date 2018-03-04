package week1;

/**
 * 10. Дано трехзначное число. Определить:
 * а) верно ли, что все его цифры одинаковые;
 * б) есть ли среди его цифр одинаковые.
 *
 * Взависимости от результата сделать вывод "Все цифры одинаковые" / "Некоторые цифры одинаковые" / "Нету одинаковых цифр"
 */
public class Task10 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        int first = number % 10;
        int second = ( number / 10 ) % 10;
        int third = number / 100;

        if ( first == second && second == third) {
            System.out.println("Все цифры одинаковые");
        } else if (first == second || first == third || second == third) {
            System.out.println("Некоторые цифры одинаковые");
        } else {
            System.out.println("Нету одинаковых цифр");
        }
    }
}
