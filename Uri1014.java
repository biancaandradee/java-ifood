import java.util.Scanner;

public class Uri1014 {
    public static void main(String args[]) {

    Scanner keyboard = new Scanner(System.in);

    int x;
    double y, total;

    x = keyboard.nextInt();
    y = keyboard.nextDouble();

    total = x / y;

    System.out.printf("%.3f km/l\n", total);

    keyboard.close();


    }
}