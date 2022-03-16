import java.util.Scanner;

public class Uri2483 {
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        
        int D = sc.nextInt();

        if (D <= 800){
            System.out.println("1");
        } else if (D <= 1400){
            System.out.println("2");
        } else {
            System.out.println("3");
        }

        //Usando ternário
        //System.out.println((D <= 800) ? "1" : (D <= 1400) ? "2" : "3");
        
        sc.close();
    }
}