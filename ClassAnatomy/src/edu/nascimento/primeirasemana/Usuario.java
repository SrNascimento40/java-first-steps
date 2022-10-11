package edu.nascimento.primeirasemana;
public class Usuario {

    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        
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
    }
}