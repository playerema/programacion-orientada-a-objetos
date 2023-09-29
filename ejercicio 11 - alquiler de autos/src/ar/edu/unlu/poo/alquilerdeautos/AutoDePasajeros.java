package ar.edu.unlu.poo.alquilerdeautos;

public class AutoDePasajeros extends Vehiculo{
    private int asiento;

    protected int generarPresupuesto(){
        return super.generarPresupuesto()+300*asiento;
    }
}
