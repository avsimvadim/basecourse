package week1;

/**
 * 2. Есть три числа, нужно вывести на консоль наибольшее
 */
public class Task2 {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int thebiggestNum = a > b ? a : b;
        thebiggestNum = thebiggestNum > c ? thebiggestNum : c;

        System.out.println(thebiggestNum);
//      Yours code...
    }
}
