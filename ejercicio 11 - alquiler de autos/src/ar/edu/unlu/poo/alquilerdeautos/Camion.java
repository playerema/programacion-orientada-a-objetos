package ar.edu.unlu.poo.alquilerdeautos;

public class Camion extends Vehiculo{

    public Camion(String patente) {
        super(patente);
    }

    protected int generarPresupuesto(){
        int n;
        if(getDiasDeAlquiler()<=30){
            n=100000;
        }else {
            n=75000;
        }
        return n*getDiasDeAlquiler();

        }
}
