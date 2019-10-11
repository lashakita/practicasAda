package main.trenesYDepositos;

import main.trenesYDepositos.excepciones.ParametrosIncorrectosException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Deposito {
    private List<Formacion> formaciones = new ArrayList<>();
    private List<Locomotora> locomotorasSueltas = new ArrayList<>();


    public List<Vagon> vagonMasPesadoPorFormacion() {
        return formaciones.stream()
                .map(Formacion::vagonMasPesado)
                .collect(Collectors.toList());
    }

    public Boolean necesitaConductorExperimentado() {
        return formaciones.stream().anyMatch(Formacion::esCompleja);
    }

    public void agregarLocomotora(Formacion formacion) {

        if (!formaciones.contains(formacion)) {
            throw new ParametrosIncorrectosException(
                    "Error agregando locomotora a formación: " +
                            "la formación no pertenece al depósito.");
        }

        if (!formacion.puedeMoverse()) {
            Double empujeFaltante = formacion.empujeFaltanteParaMoverse();
            locomotorasSueltas.stream()
                    .filter(locomotora -> locomotora.arrastreUtil() >= empujeFaltante)
                    .findFirst()
                    .ifPresent(locomotora -> {
                        formacion.agregarLocomotora(locomotora);
                        locomotorasSueltas.remove(locomotora);
                    });

        }
    }

    public List<Formacion> getFormaciones() {
        return formaciones;
    }

    public void setFormaciones(List<Formacion> formaciones) {
        this.formaciones = formaciones;
    }

    public List<Locomotora> getLocomotorasSueltas() {
        return locomotorasSueltas;
    }

    public void setLocomotorasSueltas(List<Locomotora> locomotorasSueltas) {
        this.locomotorasSueltas = locomotorasSueltas;
    }
}
