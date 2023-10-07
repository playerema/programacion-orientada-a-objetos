package ar.edu.unlu.poo.sueldodeempleados;

import java.time.LocalDate;

public class Empleado {
    protected String nombre;
    protected String apellido;
    protected Integer telefono;
    protected String cuil;
    protected LocalDate cumpleaños;

    public Float calcularSueldo(){return 0.0f;}

    protected Float bonoDeCumpleaños(){
        return 2000.0f;
    }
}
