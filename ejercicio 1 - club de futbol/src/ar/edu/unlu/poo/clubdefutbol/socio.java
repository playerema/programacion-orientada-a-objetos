package ar.edu.unlu.poo.clubdefutbol;

import java.time.LocalDate;

class Socio {
    private String nombre;
    private int dni;
    private LocalDate fechaDeInscripcion;
    private Suscripcion suscripcion;

    public Socio(LocalDate fechaDeInscripcion){
        this.fechaDeInscripcion=fechaDeInscripcion;
    }

    public Suscripcion getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripción(Suscripcion suscripcion) {
        this.suscripcion = suscripcion;
    }

    public LocalDate getFechaDeInscripcion() {
        return fechaDeInscripcion;
    }

    public void setFechaDeInscripcion(LocalDate fechaDeInscripcion) {
        this.fechaDeInscripcion = fechaDeInscripcion;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
