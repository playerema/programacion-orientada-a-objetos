package ar.edu.unlu.poo.alquilerdeautos;

/*Dado todo esto, el sistema de la agencia debe poder:

Registrar los vehículos y poder prestarlos. No debe permitirse que dos vehículos se registren con la misma patente.

Emitir un presupuesto. Un presupuesto consta de un vehículo específico y una cantidad de días de alquiler. Debe valorarse el monto final.

De un presupuesto debe poder generarse un alquiler.
De un cliente, mostrar el monto total de todos los alquileres realizados.
El monto total de todos los alquileres generados por el sistema.*/

import java.time.LocalDate;
import java.util.ArrayList;

public class Agencia {

    private static Agencia agencia;

    private ArrayList<Vehiculo> vehiculosDisponibles;

    private Agencia(){
        this.vehiculosDisponibles=new ArrayList<Vehiculo>();
    }


    public static Agencia getAgencia() {
        if (agencia == null) {
            agencia = new Agencia(); // Crear la instancia si aún no existe
        }
        return agencia; // Devolver la instancia existente
    }

    public void registrarVehiculo(Vehiculo vehiculo){
        vehiculosDisponibles.add(vehiculo);
    }

    public void prestar(String patente){
        buscarVehiculo(patente).prestado();
    }
    private Vehiculo buscarVehiculo(String patente){
        if (vehiculosDisponibles.size()==0){return null;}

        for(int i=0;i<vehiculosDisponibles.size();i++){
            Vehiculo vehiculo = vehiculosDisponibles.get(i);

            if(vehiculo.getPatente().equals(patente)){
                return vehiculo;
            }
        }

        return null;

    }

    public Presupuesto emitirPresupuesto(Vehiculo vehiculo,LocalDate inicioAlquiler,LocalDate finalAlquiler){
        Presupuesto presupuesto = new Presupuesto(vehiculo,inicioAlquiler,finalAlquiler);
        return presupuesto;
    }
}
