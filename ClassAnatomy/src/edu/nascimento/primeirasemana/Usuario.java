package edu.nascimento.primeirasemana;
public class Usuario {

    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        LogicaCondicional logicaCondicional = new LogicaCondicional();
        ExercicioMetodo exercicioMetodo = new ExercicioMetodo();
        
        
        System.out.println("TV ligada:\t" + smartTv.ligada);
        System.out.println("Canal atual:\t" + smartTv.canal);
        System.out.println("Volume atual:\t" + smartTv.volume);

        smartTv.ligar();
        smartTv.mudarCanal(47);
        smartTv.abaixarVolume();
        smartTv.abaixarVolume();
        smartTv.aumentarVolume();

        System.out.println("TV ligada:\t" + smartTv.ligada);
        System.out.println("Canal atual:\t" + smartTv.canal);
        System.out.println("Volume atual:\t" + smartTv.volume);

        logicaCondicional.operacaologica();

        exercicioMetodo.soma(7, 12);
        exercicioMetodo.subtrai(14, 12);
        exercicioMetodo.divide(14, 7);
        exercicioMetodo.multiplica(7, 35);
        exercicioMetodo.aoba();
        exercicioMetodo.area(3);
        exercicioMetodo.area(5d,5d);
        exercicioMetodo.area(7,8,9);
        exercicioMetodo.area(5f,5f);
    }
}