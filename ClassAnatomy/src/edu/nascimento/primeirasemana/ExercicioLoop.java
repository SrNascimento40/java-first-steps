package edu.nascimento.primeirasemana;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/
public class ExercicioLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Lê resposta do usuário

        String nome;
        int idade;

        while(true) {
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;
            // Código vai parar ao inserir '0' como nome

            System.out.println("Idade: ");
            idade = scan.nextInt();
        }

        System.out.println("Continua aqui...");

    }

}