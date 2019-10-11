package main.ejercicioPepita;

public class Golondrina {

    private Integer energia = 0;
    private Lugar ubicacion;

    public void comer(Integer gramos){
        energia = energia + gramos * 4;
    }
    public void volar(Integer kilometros){
        energia = energia - kilometros - 10;
    }
    public void setUbicacion(Lugar unaUbicacion){
        ubicacion = unaUbicacion;
    }
    public Lugar getUbicacion() {
        return ubicacion;
    }
    public void andaA(Lugar destino){

    }
}
