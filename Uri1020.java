import java.util.Scanner;

public class Uri1020 {
    public static void main(String args[]) {

    Scanner keyboard = new Scanner(System.in);

    int age, year, mounth, day;

    age = keyboard.nextInt();

    year = age / 365;
    mounth = (age % 365)/30;
    day = (age % 365) % 30;



    System.out.println(year + " ano(s)");
    System.out.println(mounth + " mes(es)");
    System.out.println(day + " dia(s)");

    keyboard.close();


    }
}