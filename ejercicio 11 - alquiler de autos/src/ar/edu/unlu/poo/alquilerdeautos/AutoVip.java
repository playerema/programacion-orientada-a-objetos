package ar.edu.unlu.poo.alquilerdeautos;

public class AutoVip extends AutoDePasajeros{
    private int asiento;
    protected int generarPresupuesto(){
        return super.generarPresupuesto()+500*asiento;
    }
}
