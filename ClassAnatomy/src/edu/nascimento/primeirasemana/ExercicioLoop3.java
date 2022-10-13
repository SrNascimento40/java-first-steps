package edu.nascimento.primeirasemana;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class ExercicioLoop3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int media = 0;

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            media += numero;

            if (numero > maior) maior = numero;

            count = count + 1;
        } while(count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (media/5));

    }
}
