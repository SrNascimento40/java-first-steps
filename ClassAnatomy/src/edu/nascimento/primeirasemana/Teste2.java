package edu.nascimento.primeirasemana;
import java.util.Scanner;

public class Teste2 {
    public static void main(String[] args) {
        int A, N;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();
        int resultado = 0;
        int initialA = A;
        
        while (A <= N) {
            if (A % initialA == 0) {
                resultado = resultado + A;
                System.out.println(A);
            }
            A = A+1;
        }
        System.out.println(resultado);

        //TODO:  Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".
    }
}