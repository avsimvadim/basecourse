package week2;

/**
 * 2. Создать массив целых парных чисел от 20 до 2 и вывести его на экран в виде сообщения "{20, 18, 16, 14, 12, 10, 8, 6, 4, 2}"
 */
public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
                array[i] = (array.length - i) * 2;
        }

        System.out.print("{");

        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i]+ ", ");
        }
        System.out.println(array[array.length - 1] + "}");
    }
}

