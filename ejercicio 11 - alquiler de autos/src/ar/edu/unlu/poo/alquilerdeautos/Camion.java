package ar.edu.unlu.poo.alquilerdeautos;

public class Camion extends Vehiculo{

    private int diasDeAlquiler;

    public int getDiasDeAlquiler() {
        return diasDeAlquiler;
    }

    public void setDiasDeAlquiler(int diasDeAlquiler) {
        this.diasDeAlquiler = diasDeAlquiler;
    }

    protected int generarPresupuesto(){
        int n;
        if(diasDeAlquiler<=30){
            n=100000;
        }else {
            n=75000;
        }
        return n*diasDeAlquiler;

        }
}
