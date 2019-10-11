package main.microsEmpresarios;

import java.util.*;

public class Micro {
    private Integer cantidadSentados = 0;
    private Integer cantidadParados = 0;
    private Integer volumen = 0;
    private List<Persona> pasajeros = new ArrayList<>();

    public Micro() {

    }

    public Micro(Integer cantidadSentados, Integer cantidadParados, Integer volumen) {
        this.cantidadSentados = cantidadSentados;
        this.cantidadParados = cantidadParados;
        this.volumen = volumen;
    }

    public Boolean sePuedeSubir(Persona persona) {
        return this.tenesLugar() && persona.aceptaSubir(this);
    }


    public void subiSiPodesA(Persona persona) {
        if (!this.sePuedeSubir(persona))
            throw new NoSePudoSubirPasajeroException("El pasajero no se puede subir a este micro");
        pasajeros.add(persona);
    }

    public void bajaA(Persona persona) {
        if (pasajeros.isEmpty()) throw new RuntimeException("No hay nadie en el micro para bajar");
        pasajeros.remove(persona);
    }


    public Persona quienSubioPrimero() {
        try {
            return pasajeros.get(0); //el método get() de ArrayList tira una excepción (IndexOutOfBoundsException) si la colección está vacía...
        } catch (IndexOutOfBoundsException iobe) {
            return null;
        }
    }

    public Boolean tenesLugar() {
        return this.cantidadPersonasEnElMicro() < this.capacidadTotal();
    }


    public Boolean tenesLugarSentado() {
        return this.cantidadPersonasEnElMicro() < this.cantidadSentados;
    }

    public Boolean tenesXLugaresLibres(Integer x) {
        return this.lugaresLibres() >= x;
    }

    public Integer lugaresLibres() {
        return this.capacidadTotal() - this.cantidadPersonasEnElMicro();
    }

    public Integer capacidadTotal() {
        return this.cantidadSentados + this.cantidadParados;
    }

    public Integer cantidadPersonasEnElMicro() {
        return pasajeros.size();
    }

    public Integer getVolumen() {
        return volumen;
    }

    public void setVolumen(Integer volumen) {
        this.volumen = volumen;
    }
}
