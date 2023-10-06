package ar.edu.unlu.poo.alquilerdeautos;

public class AutoDePasajeros extends Vehiculo{
    private int asiento;

    public AutoDePasajeros(String patente){super(patente);}

    protected int generarPresupuesto(){
        return super.generarPresupuesto()+300*asiento;
    }
}
