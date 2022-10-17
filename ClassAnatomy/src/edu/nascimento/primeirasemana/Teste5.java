package edu.nascimento.primeirasemana;

import java.util.*;

public class Teste5 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();
        int notFound = 0;

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 

        for (int i = 0; i < elementos.length; i++) {
            if (numero==elementos[i]) {
                System.out.println("Achei " + numero + " na posicao " + i);
                notFound = 1;
            }
        }
        if (notFound==0) {
            System.out.println("Numero " + numero + " nao encontrado!");
        }
        //TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.
    }
}