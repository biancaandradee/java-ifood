import java.util.Scanner;

public class Uri1046 {
    public static void main(String args[]) {

    Scanner keyboard = new Scanner(System.in);

    int hourI, hourF, dif;
    hourI = keyboard.nextInt();
    hourF = keyboard.nextInt();
    
    dif = hourF - hourI;

    if (dif <= 0) {
        dif = dif + 24;
    }
    
    System.out.println("O JOGO DUROU " + dif + " HORA(S)");

    keyboard.close();


    }
}