package main.trenesYDepositos;

public class VagonCarga implements Vagon {
    private Double cargaMaxima; // En kg

    //Constructor vacío
    public VagonCarga() {

    }

    public VagonCarga(Double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }


    public Integer cantidadMaximaPasajeros() {
        return 0;
    }

    public Double pesoMaximo() {
        return cargaMaxima + 160;
    }


    public Boolean esLiviano() {
        return pesoMaximo() < 2500;
    }


    public Double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(Double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

}
