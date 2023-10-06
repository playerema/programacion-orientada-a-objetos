package ar.edu.unlu.poo.alquilerdeautos;

public class CamionetaTipoFlete extends Vehiculo{
    private int pesoAutorizadoTotal;

    public CamionetaTipoFlete(String patente) {
        super(patente);
    }

    protected int generarPresupuesto(){
        return super.generarPresupuesto()+600*pesoAutorizadoTotal;
    }
}
