package main;

import main.otrosAnimales.Golondrina;


public class Main {

    public static void main(String[] args) {

        Elefante dumbo = new Elefante();

        Golondrina pepita = new Golondrina();

        System.out.println(dumbo.getPeso());

        dumbo.setPeso(150);

        System.out.println(dumbo.getPeso());

        pepita.getVelocidad();

        System.out.println(pepita.getVelocidad());



        dumbo.barritar();

        dumbo.correr(20);

        System.out.println(dumbo.getPeso());

    }
}
