package main.tamagotchi;

public interface Estado {

    void jugar(Mascota mascota);

    void comer(Mascota mascota);

    Boolean podesJugar();
}
