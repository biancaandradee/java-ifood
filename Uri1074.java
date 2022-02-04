import java.util.Scanner;

public class Uri1074 {
    public static void main(String args[]) {

    Scanner keyboard = new Scanner(System.in);

    int n, numero;

    n = keyboard.nextInt();

    for (int i = 0; i < n; i++){
        numero = keyboard.nextInt();
        if (numero == 0) {
            System.out.println("NULL");
        } else if (numero % 2 == 0 && numero > 0) {
            System.out.println("EVEN POSITIVE");
        } else if (numero % 2 == 0 && numero < 0) {
            System.out.println("EVEN NEGATIVE");
        } else if (numero % 2 != 0 && numero > 0) {
            System.out.println("ODD POSITIVE");
        } else if (numero % 2 != 0 && numero < 0) {
            System.out.println("ODD NEGATIVE");
        }

        // if (numero == 0){
        //         System.out.println("NULL");
        //     }
        //     else if (numero %2 == 0){
        //         System.out.print("EVEN "); 
        //     }
        //     else{
        //         System.out.print("ODD ");
        //     }
        //     if (numero > 0){
        //         System.out.println("POSITIVE");
        //     }
        //     else if (numero < 0){
        //         System.out.println("NEGATIVE");
        //     }
    }


    keyboard.close();


    }
}