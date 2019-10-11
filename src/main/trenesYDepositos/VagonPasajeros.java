package main.trenesYDepositos;

public class VagonPasajeros implements Vagon {
    private Double largo; //En metros
    private Double anchoUtil; //En metros

    // Constructor vacío
    public VagonPasajeros() {

    }

    // Constructor completo
    public VagonPasajeros(Double largo, Double anchoUtil) {
        this.largo = largo;
        this.anchoUtil = anchoUtil;
    }

    public Integer cantidadMaximaPasajeros() {

        return (anchoUtil <= 2.5)
                ? largo.intValue() * 8
                : largo.intValue() * 10;

    }

    public Double pesoMaximo() {
        return cantidadMaximaPasajeros().doubleValue() * 80;
    }

    public Boolean esLiviano() {
        return pesoMaximo() < 2500;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public Double getAnchoUtil() {
        return anchoUtil;
    }

    public void setAnchoUtil(Double anchoUtil) {
        this.anchoUtil = anchoUtil;
    }
}
