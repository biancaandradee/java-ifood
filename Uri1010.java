import java.util.Scanner;

public class Uri1010 {
    public static void main(String args[]) {

    Scanner keyboard = new Scanner(System.in);

    int code1, qty1, code2, qty2;
    double price1, price2, total;

    code1 = keyboard.nextInt();
    qty1 = keyboard.nextInt();
    price1 = keyboard.nextDouble();
    code2 = keyboard.nextInt();
    qty2 = keyboard.nextInt();
    price2 = keyboard.nextDouble();

    total = (qty1 * price1) + (qty2 * price2);

    System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

    keyboard.close();


    }
}