import java.util.Scanner;

public class VariasLeituras {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);

        int valor1, valor2;
        double valor3;
        String nome, texto;

        System.out.println("Digite alguns valores: ");
        valor1 = Integer.parseInt(keyboard.nextLine());
        valor2 = Integer.parseInt(keyboard.nextLine());
        valor3 = Double.parseDouble(keyboard.nextLine());

        System.out.println("Você digitou: "+ valor1 + " - " + valor2 + " - " + valor3);
        System.out.printf("Você também digitou: %d - %d - %.2f\n", valor1, valor2, valor3);

        System.out.println("Por favor digite seu nome: ");
        nome = keyboard.nextLine();
        System.out.println("Seu nome é: "+ nome);

        System.out.println("Digite outro texto agora: ");
        texto = keyboard.nextLine();
        System.out.println("Agora você digitou: " + texto);


        keyboard.close();
    }
}