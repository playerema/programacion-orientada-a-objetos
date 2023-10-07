package ar.edu.unlu.poo.sueldodeempleados;

public class empleadoPorComision extends Empleado{
    public Float comision;
    public Float ventas;

    @Override
    protected Float bonoDeCumpleaños() {
        return super.bonoDeCumpleaños()+(ventas*0.05f);
    }

    @Override
    public Float calcularSueldo(){return ventas*(comision/100) + bonoDeCumpleaños();}

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
