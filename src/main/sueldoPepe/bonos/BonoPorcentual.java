package main.sueldoPepe.bonos;

public class BonoPorcentual implements BonoResultados {
    public Double monto(Integer sueldoNeto)  { return sueldoNeto * 0.1;}
}
