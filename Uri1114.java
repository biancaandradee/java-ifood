import java.util.Scanner;

public class Uri1114 {
    public static void main(String args[]) {

    Scanner keyboard = new Scanner(System.in);

    int password = keyboard.nextInt();

    while (password != 2002) {
        System.out.println("Senha Invalida");
        password = keyboard.nextInt();
    }

    System.out.println("Acesso Permitido");

    keyboard.close();


    }
}