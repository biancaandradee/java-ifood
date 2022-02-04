
public class ExemploContinue{
    public static void main(String args[]) {

    for (int numero = 1; numero < 10; numero++) {
        if (numero == 5) {
            System.out.println("Chegou no 5!! E agora?");    
            continue;
        }
        System.out.println("Numero = " + numero);
    }
  
          

    }
}