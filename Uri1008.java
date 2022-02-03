import java.util.Scanner;

public class Uri1008 {
    public static void main(String args[]) {

    Scanner keyboard = new Scanner(System.in);

    int number, hours;
    double value, salary;

    number = keyboard.nextInt();
    hours = keyboard.nextInt();
    value = keyboard.nextDouble();

    salary = hours * value;

    System.out.println("NUMBER = " + number);
    System.out.printf("SALARY = U$ %.2f\n", salary);

    keyboard.close();


    }
}