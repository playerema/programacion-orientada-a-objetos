package ar.edu.unlu.poo.alquilerdeautos;

public class Combi extends Vehiculo{

    public Combi(String patente) {
        super(patente);
    }

    protected int generarPresupuesto(){
        return super.generarPresupuesto()+1500;
    }
}
