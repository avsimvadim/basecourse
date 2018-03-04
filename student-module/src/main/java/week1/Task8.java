package week1;

/**
 * 8. Вычислить стоимость покупки с учетом скидки. Скидка в 10% предоставляется, если сумма покупки превышает 1000 гривен.
 */
public class Task8 {
    public static void main(String[] args) {
        int purchase = Integer.parseInt(args[0]);

        if (purchase > 1000) {
            purchase *=0.9;
            System.out.println(purchase);
        }
        else {
            System.out.println(purchase);
        }

//      Yours code...
    }
}
