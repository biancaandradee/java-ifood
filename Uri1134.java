import java.util.Scanner;

public class Uri1134 {
    public static void main (String args[]) {

        Scanner keyboard = new Scanner(System.in);
        
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int n = keyboard.nextInt();

        while (n != 4) {
            n = keyboard.nextInt();
            switch (n) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
            }
        }
        System.out.printf("MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d\n", alcool, gasolina, diesel);
        
        keyboard.close();

    }
}