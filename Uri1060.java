import java.util.Scanner;

public class Uri1060 {
    public static void main(String args[]) {

    Scanner keyboard = new Scanner(System.in);

    float valor;
    int qtdePositivos = 0;

    for (int cont = 1; cont <= 6; cont++) {
        valor = keyboard.nextFloat();
        if (valor > 0) {
            qtdePositivos++;
        }
    }
    
    System.out.println(qtdePositivos + " valores positivos");

    keyboard.close();


    }
}