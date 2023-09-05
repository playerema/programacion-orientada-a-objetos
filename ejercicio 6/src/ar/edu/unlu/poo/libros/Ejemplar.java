package ar.edu.unlu.poo.libros;

public class Ejemplar {
    private Integer nro;
    private boolean estadoPrestamo = true;

    public void setEstadoPrestamo(boolean estadoPrestamo) {
        this.estadoPrestamo = estadoPrestamo;
    }

    public boolean getEstadoPrestamo(){return estadoPrestamo;}
}
