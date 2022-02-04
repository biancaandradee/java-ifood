import java.util.Scanner;

public class Uri1066 {
    public static void main(String args[]) {

    Scanner keyboard = new Scanner(System.in);

    int x, qtdeP = 0; 
    int qtdeN = 0; 
    int qtdePar = 0; 
    int qtdeImpar = 0;

    
    for (int i = 0; i < 5; i++) {
        x = keyboard.nextInt();
        if (x > 0) {
            qtdeP++;
        } else if (x < 0){
            qtdeN++;
        }
        if (x % 2 == 0) {
            qtdePar++;
        } else {
            qtdeImpar++;
        }
    }

    System.out.print(qtdePar +  " valor(es) par(es)\n" + qtdeImpar + " valor(es) impar(es)\n" + qtdeP + " valor(es) positivo(s)\n"+ qtdeN + " valor(es) negativo(s)\n");
    

    keyboard.close();


    }
}