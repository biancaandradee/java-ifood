import java.util.Scanner;

public class Uri1142 {
    public static void main (String args[]) {

        Scanner keyboard = new Scanner(System.in);
        
        int n = keyboard.nextInt();
        int cont = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(cont + " ");
                cont++;
            }
            System.out.println("PUM");
            cont++;
        }

        keyboard.close();

    }
}