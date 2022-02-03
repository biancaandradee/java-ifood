// Leia 4 valores inteiros A, B, C e D
// Se B for maior que C e,                              B > C
// Se D for maior que A e,                              D > A
// A soma de C com D for maior que a soma de A e B e,   C + D > A + B
// Se C e D, ambos, forem positivos e,                  C > 0 && D > 0
// Se a variável A for par                              A % 2 == 0


import java.util.Scanner;

public class Uri1035{
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);

        int a, b, c, d;

        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();
        d = keyboard.nextInt();

        //       1          2             3                  4                  5
        //if ((b > c) && (d > a) && (c + d > a + b) && (c > 0 && d > 0) && (a % 2 == 0)) {
        if (b > c && d > a && c + d > a + b && c > 0 && d > 0 && a % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores não aceitos");
        }
    
        keyboard.close();
    }

}