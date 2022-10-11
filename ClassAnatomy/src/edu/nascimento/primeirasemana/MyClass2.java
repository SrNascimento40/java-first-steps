package edu.nascimento.primeirasemana;
public class MyClass2 {
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
        String name1 = "Wallace";
        String name2 = "Nascimento";

        String fullName = completeName(name1, name2);

        System.out.println(fullName);

        String concatenacao = "?";
        concatenacao = 1 + 1 + "1" + 5 ;
        //ele soma enquanto só aparecerem int e concatena quando identificar que se torna uma string
        
        System.out.println(concatenacao);


        concatenacao =  8 + 1 + concatenacao;
        System.out.println(concatenacao);
    }
    
    public static String completeName (String name1, String name2) {
        // (tipo de retorno) + (nome objetivo no infinitivo) + (parâmetros)
        return name1.concat(" ").concat(name2);
    }
}
