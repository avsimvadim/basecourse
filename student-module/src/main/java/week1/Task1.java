package week1;

/**
 * 1. Есть текущий час от 0 до 24 (либо другое значение).
 * Если время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю")
 * В случае введения неверных значений (больше 24 и меньше 0) выводим "Неверное число"
 */
public class Task1 {
    public static void main(String[] args) {
        int time = Integer.parseInt(args[0]);
        if (time > 9 && time < 18){
            System.out.println("Я на работе");
        }
        else if (time >= 0 && time <= 24){
            System.out.println("Я отдыхаю");
        } else {
            System.out.println("Неверное число");
        }
//      Yours code...
    }
}
