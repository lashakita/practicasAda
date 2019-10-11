package main.ejercicioCelulares;

public class MainCelulares {
    public static void main(String[] args) {


        Iphone celIphone = new Iphone();
        Samsung celSamsung = new Samsung();
        Persona juliana = new Persona();
        Persona catalina = new Persona();


        juliana.setCelular(celSamsung);
        catalina.setCelular(celIphone);

        juliana.getCelular().recargarBateria();
        catalina.getCelular().recargarBateria();

        if (juliana.celularApagado()) {
            System.out.println("Juliana tiene el celular apagado :(");
        } else {
            System.out.println("Juliana tiene batería!! Cantidad de puntos: "+
                                    juliana.getCelular().getBateria());
        }

        if (catalina.celularApagado()) {
            System.out.println("Juliana tiene el celular apagado :(");
        } else {
            System.out.println("Juliana tiene batería!! Cantidad de puntos: "+
                    catalina.getCelular().getBateria());
        }


        Movistar movistar = new Movistar();
        Personal personal = new Personal();
        catalina.setServicioTelefonia(movistar);
        juliana.setServicioTelefonia(personal);


        System.out.println("El gasto inicial de Juliana es: " + juliana.getGasto());
        System.out.println("El gasto inicial de Catalina es: " + catalina.getGasto());



        System.out.println("*** Primera llamada ***");
        juliana.llamarA(catalina, 5.0);


        System.out.println("Batería del celular de Juliana: " + juliana.getCelular().getBateria());
        System.out.println("Batería del celular de Catalina: " + catalina.getCelular().getBateria());
        System.out.println("Gasto de Juliana: " + juliana.getGasto());
        System.out.println("Gasto de Catalina: " + catalina.getGasto());


        System.out.println("*** Segunda llamada ***");
        if (!juliana.celularApagado() && !catalina.celularApagado()) {
            catalina.llamarA(juliana, 15.0);
        } else {
            System.out.println("Uno de los dos main.ejercicioCelulares está apagado y la llamada no puede realizarse.");
        }
        System.out.println("Batería del celular de Juliana: " + juliana.getCelular().getBateria());
        System.out.println("Batería del celular de Catalina: " + catalina.getCelular().getBateria());
        System.out.println("Gasto de Juliana: " + juliana.getGasto());
        System.out.println("Gasto de Catalina: " + catalina.getGasto());

        System.out.println("*** Tercera llamada ***");
        if (!juliana.celularApagado() && !catalina.celularApagado()) {
            catalina.llamarA(juliana, 32.0);
        } else {
            System.out.println("Uno de los dos main.ejercicioCelulares está apagado y la llamada no puede realizarse.");
        }
        System.out.println("Batería del celular de Juliana: " + juliana.getCelular().getBateria());
        System.out.println("Batería del celular de Catalina: " + catalina.getCelular().getBateria());
        System.out.println("Gasto de Juliana: " + juliana.getGasto());
        System.out.println("Gasto de Catalina: " + catalina.getGasto());

        System.out.println("*** Cuarta llamada ***");
        if (!juliana.celularApagado() && !catalina.celularApagado()) {
            catalina.llamarA(juliana, 8.0);
        } else {
            System.out.println("Uno de los dos main.ejercicioCelulares está apagado y la llamada no puede realizarse.");
        }
        System.out.println("Batería del celular de Juliana: " + juliana.getCelular().getBateria());
        System.out.println("Batería del celular de Catalina: " + catalina.getCelular().getBateria());
        System.out.println("Gasto de Juliana: " + juliana.getGasto());
        System.out.println("Gasto de Catalina: " + catalina.getGasto());
    }
}
