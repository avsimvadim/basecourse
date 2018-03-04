package week1;

/**
 * 4. Есть значения трех сторон треугольника a, b и c.
 * Определить, является ли он прямоугольным. Ответ вывести в виде сообщения true/false.
 */
public class Task4 {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        boolean result = Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2) ||
                Math.pow(b,2) + Math.pow(c,2) == Math.pow(a,2) ||
                Math.pow(c,2) + Math.pow(a,2) == Math.pow(b,2);

        System.out.println(result);

//      Yours code...

    }
}
