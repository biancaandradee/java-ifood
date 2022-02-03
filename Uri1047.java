import java.util.Scanner;

public class Uri1047 {
    public static void main(String args[]){
        Scanner keybooard = new Scanner(System.in);

        int hourI, hourF, minI, minF, timeI, timeF, timeT, hourT, minT;
        hourI = keybooard.nextInt();
        minI = keybooard.nextInt();
        hourF = keybooard.nextInt();
        minF = keybooard.nextInt();

        // 1a coisa - converter todo mundo pra mintos
        timeI = hourI * 60 + minI;
        timeF = hourF * 60 + minF;

        timeT = timeF - timeI;

        if (timeT <= 0){
            timeT = timeT + 24*60; // ou 1440
        }

        // desconverto
        hourT = timeT / 60;
        minT = timeT % 60;

        System.out.println("O JOGO DUROU " + hourT + " HORA(S) E " + minT+ " MINUTO(S)");

        keybooard.close();
    }
}

