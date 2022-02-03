import java.util.Scanner;

public class Uri1048 {
    public static void main(String args[]) {

    Scanner keyboard = new Scanner(System.in);

    double salary, bonus, newSalary, perc;
    salary = keyboard.nextDouble();

    if (salary > 0 && salary <= 400.00) {
        perc = 0.15;
    } else if (salary > 400.00 && salary <= 800.00){
        perc = 0.12;
    } else if (salary > 800.00 && salary <= 1200.00) {
        perc = 0.10;
    } else if (salary > 1200.00 && salary <= 2000.00) {
        perc = 0.07;
    } else {
        perc = 0.04;
    }

    bonus = salary * perc;
    newSalary = salary + bonus;
    //perc = perc * 100;

    System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %d %%\n", newSalary, bonus, (int)(perc*100));

    keyboard.close();


    }
}