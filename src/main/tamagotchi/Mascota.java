package main.tamagotchi;

public class Mascota {
    private Estado estado = new Aburrida(); //"nace" aburrida, porque pintó.
    private Integer nivelDeContentura = 0;
    private Long minutosAburrida = 0L;
    private Integer cantidadDeVecesQueJugo = 0;



    public void jugar() {
        this.estado.jugar(this);
    }


    public void comer() {
        this.estado.comer(this);
    }


    public Boolean podesJugar() {
        return this.estado.podesJugar();
    }

    public void setEstado(Estado unEstado) {
        this.estado = unEstado;
    }

    public void incrementarNivelDeContentura(Integer nivel) {
        this.nivelDeContentura = this.nivelDeContentura + nivel;
    }


    public Boolean masDe80minAburrida() {
        minutosAburrida = System.currentTimeMillis() / 60000 - minutosAburrida;
        return  minutosAburrida > 80;
    }

    public Boolean jugoMasDe5veces() {
        return cantidadDeVecesQueJugo > 5;
    }
}
