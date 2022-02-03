import java.util.Scanner;

public class SayHello {
    public static void main(String args[]) {

    Scanner keyboard = new Scanner(System.in);

    String idioma;

    System.out.println("Digite o idioma desejado: ");
    idioma = keyboard.nextInt();
    
    switch(idioma) {
        case "br":
        case "BR":
        case "Pt-Br":
        case "PT_BR":
            System.out.println("Olá Mundo!");
            break;
        case "ing":
        case "eng":
        case "Ing":
        case "ING":
        case "ENG":
        case "Eng":
        case "US":
        case "us":
            System.out.println("Hello World!");
            break;
        case "it":
        case "IT":
        case "It":
            System.out.println("Ciao Mondo!");
            break;
        default:
            System.out.println("Não sei falar");

    }

    keyboard.close();


    }
}