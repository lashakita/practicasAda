package main.tamagotchi;

public class Contenta implements Estado {

    public void comer(Mascota mascota) {
        mascota.incrementarNivelDeContentura(1);
    }

    public void jugar(Mascota mascota) {
        mascota.incrementarNivelDeContentura(2);
        if (mascota.jugoMasDe5veces()) mascota.setEstado(new Hambrienta());
    }

    public Boolean podesJugar() {
        return true;
    }

}




