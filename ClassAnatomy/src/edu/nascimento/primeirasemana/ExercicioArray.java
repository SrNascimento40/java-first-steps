package edu.nascimento.primeirasemana;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class ExercicioArray {
    public static void main(String[] args) {

        int[] vetor = {3, 45, -1, 17, -21, -6};

        System.out.print("\nVetor invertido: ");
        for(int i = (vetor.length - 1); i >= 0; i --) {
            System.out.print(vetor[i] + " ");
        }

    }
}
