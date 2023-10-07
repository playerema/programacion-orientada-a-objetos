package ar.edu.unlu.poo.clubdefutbol;

import java.time.LocalDate;

public class Actividad {
    private String nombre;
    private Suscripcion.tipo tipoDeSuscripcion;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTipoDeSuscripcion(Suscripcion.tipo tipoDeSuscripcion) {
        this.tipoDeSuscripcion = tipoDeSuscripcion;
    }

    public Suscripcion.tipo getTipoDeSuscripcion() {
        return tipoDeSuscripcion;
    }
}
