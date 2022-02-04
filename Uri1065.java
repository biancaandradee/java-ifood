import java.util.Scanner;

public class Uri1065 {
    public static void main (String args[]) {
        Scanner keyboard = new Scanner(System.in);

        int valor, qtde = 0;


        for (int i = 0; i < 5; i++) {
            valor = keyboard.nextInt();
            if (valor % 2 == 0) {
                qtde++;
            }
        }
        
        System.out.println(qtde + " valores pares");

        keyboard.close();
    }
}