package main.ejercicioCelulares;

public class Iphone implements Celular {
    private Double bateria;

    public Double getBateria(){
        return bateria;
    }

    public Boolean estaApagado() {
        return bateria==0;
    }

    public void recargarBateria() {
        this.bateria = 5.0;
    }

    public void consumirBateria(Double minutosDuracion) {

        Double bateriaConsumida = 0.1*minutosDuracion;
        if (bateria>bateriaConsumida) {

            bateria -= bateriaConsumida;
        } else {
            bateria = 0.0;
        }
    }
}
