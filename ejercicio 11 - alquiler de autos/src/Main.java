import ar.edu.unlu.poo.alquilerdeautos.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Agencia agencia = Agencia.getAgencia();
        Cliente cliente = new Cliente("roberto aguirre");

        AutoDePasajeros auto = new AutoDePasajeros("AB 1234 CD");

        agencia.registrarVehiculo(auto);
        agencia.prestar("AB 1234 CD");


        Presupuesto presupuesto = agencia.emitirPresupuesto(auto, LocalDate.now(),LocalDate.of(2025,01,05));

        presupuesto.generarAlquiler(cliente);

        System.out.println(cliente.montoTotalAlquileres());

        System.out.println(agencia.totalDeAlquileres());


    }
}