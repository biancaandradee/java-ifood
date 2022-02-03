import java.util.Scanner;

public class Uri1019 {
    public static void main(String args[]) {

    Scanner keyboard = new Scanner(System.in);

    int n, h, m, s;

    n = keyboard.nextInt();
    
    h = n / 3600;
    m = (n % 3600) / 60;
    s = (n % 3600) % 60;
   

    System.out.println(h + ":" + m + ":" + s);

    keyboard.close();


    }
}