import java.util.Scanner;

public class Uri1043 {
    public static void main(String args[]) {

    Scanner keyboard = new Scanner(System.in);

    double a, b, c, perimetro, area;
    a = keyboard.nextDouble();
    b = keyboard.nextDouble();
    c = keyboard.nextDouble();


    if ((a + b > c) && (a + c > b) && (b + c > a)) {
        perimetro = a + b + c;
        System.out.printf("Perimetro = %.1f\n", perimetro);
    } else {
        area = (a + b) * c / 2;
        System.out.printf("Area = %.1f\n", area);
    }

    keyboard.close();


    }
}