package week1;

/**
 * 11. Написать программу, которая при вводе числа в диапазоне от 1 до 99 добавляет к нему слово "копейка" в правильной форме.
 * Например, 1 копейка, 5 копеек, 42 копейки.
 */
public class Task11 {

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        switch (number) {
            case 1:
            case 21:
            case 31:
            case 41:
            case 51:
            case 61:
            case 71:
            case 81:
            case 91:
                System.out.println(number + " копейка");
                break;
            case 2:
            case 3:
            case 4:
            case 22:
            case 23:
            case 24:
            case 32:
            case 33:
            case 34:
            case 42:
            case 43:
            case 44:
            case 52:
            case 53:
            case 54:
            case 62:
            case 63:
            case 64:
            case 72:
            case 73:
            case 74:
            case 82:
            case 83:
            case 84:
            case 92:
            case 93:
            case 94:
                System.out.println(number + " копейки");
                break;
            default:
                System.out.println(number + " копеек");
                break;

        }


    }
}
