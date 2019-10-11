package main.sueldoPepeSuper.bonos;

public class BonoSobreFaltas implements BonoPresentismo {
    public Integer monto(Integer faltas) {
        return faltas == 0 ? 100
                : faltas == 1 ? 50
                : 0;
    }
}
