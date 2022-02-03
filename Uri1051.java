import java.util.Scanner;

public class Uri1051 {
    public static void main(String args[]) {

    Scanner keyboard = new Scanner(System.in);

    double salary;
    salary = keyboard.nextDouble();

    if (salary > 0 && salary <= 400.00) {
        perc = 15;
    } else if (salary > 400.00 && salary <= 800.00){
        perc = 12;
    } else if (salary > 800.00 && salary <= 1200.00) {
        perc = 10;
    } else if (salary > 1200.00 && salary <= 2000.00) {
        perc = 7;
    } else {
        perc = 4;
    }

    bonus = salary * perc;
    newSalary = salary + bonus;
        
    System.out.printf("Novo salario: %.2f\n Reajuste ganho: %.2f\n Em percentual: %d '%'\n", newSalary, bonus, perc);

    keyboard.close();


    }
}