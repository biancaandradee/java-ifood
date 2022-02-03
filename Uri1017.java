import java.util.Scanner;

public class Uri1017 {
    public static void main(String args[]) {

    Scanner keyboard = new Scanner(System.in);

    int time, veloc;
    double liter;

    time = keyboard.nextInt();
    veloc = keyboard.nextInt();

    liter = (double) (time * veloc)/12;

    System.out.printf("%.3f\n", liter);

    keyboard.close();


    }
}