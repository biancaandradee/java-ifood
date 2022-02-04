import java.util.Scanner;

public class Uri1114 {
    public static void main(String args[]) {

    Scanner keyboard = new Scanner(System.in);

    int password = keyboard.nextInt();
    int correctPass = 2002;

    do {
        if (password != correctPass) {
            System.out.println("Senha Invalida");

        }
    }
    if (password != correctPass) {
        System.out.println("Senha Invalida");
    } else {
        System.out.println("Acesso Permitido");
    }

    keyboard.close();


    }
}