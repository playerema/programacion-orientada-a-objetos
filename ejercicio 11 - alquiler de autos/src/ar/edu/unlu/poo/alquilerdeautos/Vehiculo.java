package ar.edu.unlu.poo.alquilerdeautos;

public abstract class Vehiculo {
    private String Patente;
    private boolean prestado;

    public void setPatente(String patente) {
        Patente = patente;
    }

    public String getPatente() {
        return Patente;
    }

    public void prestado() {
        this.prestado = true;
    }

    public void devuelto() {
        this.prestado = false;
    }

    public boolean getPrestado() {
        return prestado;
    }

    protected int generarPresupuesto() {
        return 3000;
    }


}
