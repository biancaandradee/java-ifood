import java.util.Scanner;

public class Uri1115 {
    public static void main(String args[]) {

    Scanner keyboard = new Scanner(System.in);

    int x, y;

    x = keyboard.nextInt();
    y = keyboard.nextInt();

    while (x != 0 || y != 0) {
        if (x > 0 && y > 0) {
            System.out.println("primeiro");
        } else if (x < 0 && y > 0) {
            System.out.println("segundo");
        } else if (x < 0 && y < 0) {
            System.out.println("terceiro");
        } else if (x > 0 && y < 0) {
            System.out.println("quarto");
        }
        x = keyboard.nextInt();
        y = keyboard.nextInt();
    }

    //Outra alternativa
    do {
        x = keyboard.nextInt();
        y = keyboard.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("primeiro");
        } else if (x < 0 && y > 0) {
            System.out.println("segundo");
        } else if (x < 0 && y < 0) {
            System.out.println("terceiro");
        } else if (x > 0 && y < 0) {
            System.out.println("quarto");
        }

    } while (x != 0 && y != 0);    //while (x * y != 0)

    keyboard.close();


    }
}