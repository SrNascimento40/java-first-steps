package edu.nascimento.primeirasemana;
import java.util.*;

public class Teste {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println(" Digite o primeiro número: ");
        int a = leitor.nextInt();
        System.out.println("\n Digite o segundo número: ");
        int b = leitor.nextInt();
        
        if (a==b) {
          System.out.println("Sao iguais!");
        } else {
          System.out.println("Nao sao iguais!");
        }
        //TODO: Imprima se os valores numéricos passados são iguais ou não.

    }
}