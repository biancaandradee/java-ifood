import java.util.Scanner;

public class Uri1070 {
    public static void main(String args[]) {

    Scanner keyboard = new Scanner(System.in);

    int x = keyboard.nextInt();
    int cont = 0;

    while (cont < 6) {
        if (x % 2 == 1) {
            System.out.println(x);
            cont++;
        }
        x++;
    }

    keyboard.close();


    }
}