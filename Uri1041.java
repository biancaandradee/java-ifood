import java.util.Scanner;

public class Uri1041 {
    public static void main(String args[]) {

    Scanner keyboard = new Scanner(System.in);

    double x, y;
    x = keyboard.nextDouble();
    y = keyboard.nextDouble();

    if (x == 0 && y == 0) {
        System.out.println("Origem");
    } else if (x > 0 && y > 0) {
        System.out.println("Q1");
    } else if (x < 0 && y > 0) {
        System.out.println("Q2");
    } else if (x < 0 && y < 0) {
        System.out.println("Q3");
    } else if (x > 0 && y < 0) {
        System.out.println("Q4");
    } else if (x == 0) {
        System.out.println("Eixo Y");
    } else {
        System.out.println("Eixo X");
    }

    keyboard.close();


    }
}