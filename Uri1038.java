import java.util.Scanner;

public class Uri1038{
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);

        int qtd, codigo;
        double total;

        codigo = keyboard.nextInt();
        qtd    = keyboard.nextInt();

        if (codigo == 1){   // código é 1? Beleza só calcular
            total = qtd * 4.0;
        }
        else{ // código não é 1, então pode ser 2, 3, 4 ou 5
            if (codigo == 2){  // já que não é o 1, testo se é o 2
                total = qtd * 4.50;
            }
            else{ // não é 2, então pode ser 3, 4 ou 5
                if (codigo == 3){
                    total = qtd * 5.0;
                }
                else{ // só pode ser 4 ou 5
                    if (codigo == 4){
                        total = qtd * 2.0;
                    }
                    else{
                        total = qtd * 1.50;
                    }
                }
            }
        }
        System.out.printf("Total: R$ %.2f\n", total);


        keyboard.close();
    }
}