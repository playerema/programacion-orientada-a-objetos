package ar.edu.unlu.poo.sueldodeempleados;

public class EmpleadoPorComisionConSalarioBase extends empleadoPorComision{
    public Float sueldo;

    @Override
    protected Float bonoDeCumpleaños() {
        return super.bonoDeCumpleaños()+1000.0f + ventas*0.05f;
    }

    @Override
    public Float calcularSueldo(){return sueldo+(ventas*(comision/100))+bonoDeCumpleaños();}

    public void setSueldo(Float sueldo) {
        this.sueldo = sueldo;
    }

    public Float getSueldo() {
        return sueldo;
    }

    public void setComision(Float comision) {
        this.comision = comision;
    }

    public Float getComision() {
        return comision;
    }

    public void setVentas(Float ventas) {
        this.ventas = ventas;
    }

    public Float getVentas() {
        return ventas;
    }
}
