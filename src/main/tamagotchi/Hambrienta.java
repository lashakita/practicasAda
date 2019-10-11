package main.tamagotchi;

public class Hambrienta implements Estado {

    public void jugar(Mascota mascota) {
        //NO HACE NADA - Pero se define para que los estados sean polimórficos.
    }

    public void comer(Mascota mascota) {
        mascota.setEstado(new Contenta());
    }


    public Boolean podesJugar() {
        return false;
    }
}
