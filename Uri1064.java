import java.util.Scanner;

public class Uri1064 {
    public static void main(String args[]) {

    Scanner keyboard = new Scanner(System.in);

    float valor, media, soma = 0;
    int qtdePositivos = 0;

    for (int cont = 1; cont <= 6; cont++) {
        valor = keyboard.nextFloat();
        if (valor > 0) {
            qtdePositivos++;
            soma += valor;
        }
    }

    media = soma / qtdePositivos;
    
    System.out.println(qtdePositivos + " valores positivos");
    System.out.printf("%.1f\n", media);

    keyboard.close();


    }
}