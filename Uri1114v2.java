import java.util.Scanner;

public class Uri1114v2 {
    public static void main(String args[]) {

    Scanner keyboard = new Scanner(System.in);

    int password;

    do {
        password = keyboard.nextInt();
        if (senha == 2002) {
            System.out.println("Acesso Permitido");
        } else {
            System.out.println("Senha Invalida");
        }

    } while (password != 2002);

    //Outra alternativa

    while (true) {
         password = keyboard.nextInt();
        if (senha == 2002) {
            System.out.println("Acesso Permitido");
            break;
        } else {
            System.out.println("Senha Invalida");
        }

    }

    keyboard.close();


    }
}