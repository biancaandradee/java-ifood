import java.util.Scanner;

public class Uri1009 {
    public static void main(String args[]) {

    Scanner keyboard = new Scanner(System.in);

    String name;
    double salary, sales, total;

    name = keyboard.nextLine();
    salary = keyboard.nextDouble();
    sales = keyboard.nextDouble();

    total = salary + sales * 0.15;

    System.out.printf("TOTAL = R$ %.2f\n", total);

    keyboard.close();


    }
}