import java.util.Locale;
import java.util.Scanner;

public class MyClass {
    // public static void main(String[] args) {
    //     System.out.println("Aoba!");
    //     final String BR = "Brasil";
    //     //final significa que não sofrerá mais alterações
    //     double PI = 3.14;
    //     int ESTADOS_BRASILEIROS = 27;
    //     // (tipo) + (nome bem definido) = (atribuição)
    //     System.out.println(BR);
    //     System.out.println(PI);
    //     System.out.println(ESTADOS_BRASILEIROS);
    // }

    public static void main(String [] args) {
        String name1 = args [0];
        //recebe esses parâmetros ao ser executado
        String name2 = args [1];

        String fullName = completeName(name1, name2);

        System.out.println(fullName);

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("digite sua idade:\t");
        int idade = scanner.nextInt();

        System.out.println("você tem " + idade + " anos!");

    }
    
    public static String completeName (String name1, String name2) {
        // (tipo de retorno) + (nome objetivo no infinitivo) + (parâmetros)
        return name1.concat(" ").concat(name2);
    }
}
