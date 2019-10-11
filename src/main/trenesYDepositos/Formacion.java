package main.trenesYDepositos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Formacion {
    private List<Locomotora> locomotoras = new ArrayList<>();
    private List<Vagon> vagones = new ArrayList<>();

    public Integer cantidadMaximaPasajeros() {
        return vagones.stream().mapToInt(Vagon::cantidadMaximaPasajeros).sum();
    }


    public Integer cantidadVagonesLivianos() {

        return (int) vagones.stream().filter(Vagon::esLiviano).count();

    }

    public Double velocidadMaxima() {
        return locomotoras.stream()
                .min(Comparator.comparing(Locomotora::getVelocidadMaxima))
                .get().getVelocidadMaxima();
    }


    public Boolean esEficiente() {
        return locomotoras.stream().allMatch(Locomotora::esEficiente);
    }

    public Boolean puedeMoverse() {
        return arrastreUtilTotal() >= pesoMaximoVagones();
    }

    public Double arrastreUtilTotal() {
        return locomotoras.stream()
                .mapToDouble(Locomotora::arrastreUtil)
                .sum();
    }

    public Double pesoMaximoVagones() {
        return vagones.stream()
                .mapToDouble(Vagon::pesoMaximo)
                .sum();
    }


    public Double empujeFaltanteParaMoverse() {
        return puedeMoverse() ? 0 : pesoMaximoVagones() - arrastreUtilTotal();
    }


    public Vagon vagonMasPesado() {
        return vagones.stream().max(Comparator.comparing(Vagon::pesoMaximo)).get();
    }


    public Boolean esCompleja() {
        return cantidadUnidades() > 20 || pesoTotal() > 10000;
    }

    public Integer cantidadUnidades() {
        return locomotoras.size() + vagones.size();
    }

    public Double pesoLocomotoras() {
        return locomotoras.stream()
                .mapToDouble(Locomotora::getPeso)
                .sum();
    }

    public Double pesoTotal() {
        return pesoLocomotoras() + pesoMaximoVagones();
    }


    public void agregarLocomotora(Locomotora locomotora) {
        locomotoras.add(locomotora);
    }


    public List<Locomotora> getLocomotoras() {
        return locomotoras;
    }

    public void setLocomotoras(List<Locomotora> locomotoras) {
        this.locomotoras = locomotoras;
    }

    public List<Vagon> getVagones() {
        return vagones;
    }

    public void setVagones(List<Vagon> vagones) {
        this.vagones = vagones;
    }
}
