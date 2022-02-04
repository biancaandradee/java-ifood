import java.util.Scanner;

public class Uri1051 {
    public static void main(String args[]) {

    Scanner keyboard = new Scanner(System.in);

    double salary = keyboard.nextDouble();

    if (salary >= 0 && salary <= 2000) {
        System.out.println("Isento");
    } else if (salary > 2000 && salary <= 3000){
        System.out.printf("R$ %.2f\n", (salary - 2000) * 0.08);
    } else if (salary > 3000 && salary <= 4500) {
        System.out.printf("R$ %.2f\n", (salary - 3000) * 0.18 + (1000 * 0.08));
    } else {
        System.out.printf("R$ %.2f\n", ((salary - 4500) * 0.28 + (1500 * 0.18) + (1000 * 0.08)));
    }


        

    keyboard.close();


    }
}