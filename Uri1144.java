import java.util.Scanner;

public class Uri1144 {
    public static void main (String args[]) {

        Scanner keyboard = new Scanner(System.in);
        
        int n = keyboard.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + (i * i) + " " + (i * i * i));
            System.out.println(i + " " + (i * i + 1) + " " + (i * i * i + 1));
            
        }

        keyboard.close();

    }
}