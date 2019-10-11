package main.sueldoPepe.herencia;

import main.sueldoPepe.bonos.BonoPresentismo;
import main.sueldoPepe.bonos.BonoResultados;

public abstract class Empleado {
    protected Integer faltas;
    protected BonoPresentismo bonoPresentismo;
    protected BonoResultados bonoResultados;

    public Double sueldo() {
        return this.neto() + this.bonoPresentismo.monto(this.faltas)
                + this.bonoResultados.monto(this.neto());
    }

    protected abstract Integer neto();

}
