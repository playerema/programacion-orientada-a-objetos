package ar.edu.unlu.poo.sueldodeempleados;

public class empleadoAsalariados extends Empleado{

    public Float sueldo;

    public Float edad;

    @Override
    protected Float bonoDeCumpleaños() {
        return super.bonoDeCumpleaños()+(1000.0f*edad);
    }

    @Override
    public Float calcularSueldo(){return sueldo + bonoDeCumpleaños();}


    public void setSueldo(Float sueldo) {
        this.sueldo = sueldo;
    }

    public Float getSueldo() {
        return sueldo;
    }
}
