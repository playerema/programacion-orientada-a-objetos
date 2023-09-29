package ar.edu.unlu.poo.alquilerdeautos;

public class CamionetaTipoFlete extends Vehiculo{
    private int pesoAutorizadoTotal;

    protected int generarPresupuesto(){
        return super.generarPresupuesto()+600*pesoAutorizadoTotal;
    }
}
