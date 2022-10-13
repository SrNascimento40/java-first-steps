package edu.nascimento.primeirasemana;

public class LogicaCondicional {

    public void operacaologica() {

        float f1 = 4.184F;
        float f2 = 4.178F;

        boolean verdade = true;
        boolean mentira = false;

        if (f1 >= f2) {
            System.out.println("\n" + f1 + " is bigger than " + f2);
        } else {
            System.out.println("\n" + f1 + " is not bigger than " + f2);
        }

        if (verdade && mentira) {
            System.out.println("\nBoth values are true");
        }
    }
}
