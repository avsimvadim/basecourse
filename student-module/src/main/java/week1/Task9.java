package week1;
import java.util.Scanner;
/**
 * 9. Написать программу вычисления идеального веса пользователя.
 * Выдать рекомендации о необходимости поправиться либо похудеть.
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your height in santimetres");
        double height = scanner.nextDouble();

        System.out.println("Enter your weight in kilograms");
        double weight = scanner.nextDouble();

        if (height - 100 == weight )
            System.out.println("You have excellent weight");
        else if (height - 100 > weight)
            System.out.println("You are to thin. You have to eat more");
        else
            System.out.println("You are too fat. You have to eat less than usual");
        scanner.close();
        //      Yours code...

    }
}
