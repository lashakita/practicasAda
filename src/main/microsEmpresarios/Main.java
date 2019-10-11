package main.microsEmpresarios;

public class Main {

    public static void main(String[] args) {
        //El constructor del Micro es (cantParados, cantSentados, volumen)
        Micro elrapido = new Micro(20, 20, 200);
        Micro chevallier = new Micro(20, 30, 100);

        Claustrofobico jonasa = new Claustrofobico();

        elrapido.sePuedeSubir(jonasa);
        chevallier.sePuedeSubir(jonasa);


        try {
            chevallier.subiSiPodesA(jonasa);
        } catch (NoSePudoSubirPasajeroException exception) {
            System.out.println("No se pudo subir al pasajero, vamos a probar otro micro!");

            elrapido.subiSiPodesA(jonasa);
        }


        System.out.println(elrapido.quienSubioPrimero());
        System.out.println(chevallier.quienSubioPrimero());
    }
}
