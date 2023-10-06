package ar.edu.unlu.poo.alquilerdeautos;

public class AutoVip extends AutoDePasajeros{
    private int asiento;

    public AutoVip(String patente) {
        super(patente);
    }

    protected int generarPresupuesto(){
        return super.generarPresupuesto()+500*asiento;
    }
}
