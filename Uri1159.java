import java.util.Scanner;

public class Uri1159 {
    public static void main (String args[]){


        int x = new Scanner(System.in);
        int valorTotal;
        int valorInicial;

        do {
            //Leia x
            x = sc.nextInt();
            if (x != 0){    //Se x cumpre a regra de ser diferente de zero
                valorTotal = 0;
                if (x % 2 != 0){    //o x digitado é par? se sim, não muda... se for impar, vai pro próximo que é o par
                    valorInicial = x + 1;
                } else {
                    valorInicial = x;
                }
                for (int cont = 1; cont <=5; cont++){  //Conto 5x e vou somando..
                    valorTotal += valorInicial;
                    valorInicial += 2;
                }
                System.out.println(valorTotal);
            }
        } while(x != 0);
        

        sc.close();
    }
}