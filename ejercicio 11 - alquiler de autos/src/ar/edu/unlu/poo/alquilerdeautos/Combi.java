package ar.edu.unlu.poo.alquilerdeautos;

public class Combi extends Vehiculo{

    protected int generarPresupuesto(){
        return super.generarPresupuesto()+1500;
    }
}
