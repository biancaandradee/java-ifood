import java.util.Scanner;

public class Uri1073 {
    public static void main(String args[]) {

    Scanner keyboard = new Scanner(System.in);

    int n = keyboard.nextInt();
    int pow;

     for (int i = 2; i <= n; i += 2) {
         pow = i * i;
        System.out.println(i + "^2 = " + pow);
    }

    keyboard.close();


    }
}