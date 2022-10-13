package edu.nascimento.primeirasemana;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// import java.util.Scanner;

public class ExercicioMetodo {
    public int soma(int numero1, int numero2) {
        return (numero1 + numero2);
    }

    public int subtrai(int numero1, int numero2) {
        return (numero1 - numero2);
    }

    public int multiplica(int numero1, int numero2) {
        return (numero1 * numero2);
    }

    public int divide(int numero1, int numero2) {
        return (numero1 / numero2);
    }

    public void aoba() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH");
        int hora = Integer.parseInt(dtf.format(LocalDateTime.now()));

        if (hora >= 3 && hora < 12) {
            System.out.println("Aoba! Dia!!");
        } else if (hora <= 18 && hora >= 12) {
            System.out.println("Aoba! Tarde!!");
        } else {
            System.out.println("Aoba! Noite!!");
        }
    }

    public void area(double lado) {

        System.out.println("Área do quadrado:" + lado * lado);
    }

    public void area(double lado1, double lado2) {

        System.out.println("Área do retângulo:" + lado1 * lado2);
    }

    public void area(double baseMaior, double baseMenor, double altura) {

        System.out.println("Área do trapézio:" + ((baseMaior + baseMenor) * altura) / 2);
    }

    public void area(float diagonal1, float diagonal2) {

        System.out.println("Área do losango:" + (diagonal1 * diagonal2) / 2);
    }

}
// Scanner scan = new Scanner(System.in);