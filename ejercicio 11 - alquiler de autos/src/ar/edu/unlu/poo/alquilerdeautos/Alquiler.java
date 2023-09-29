package ar.edu.unlu.poo.alquilerdeautos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler {
    private Cliente cliente;
    private Presupuesto presupuesto;

    public Alquiler(Cliente cliente,Presupuesto presupuesto){
        this.cliente=cliente;
        this.cliente.agregarAlquiler(this);
        this.presupuesto=presupuesto;
    }

    public int generarSaldo(){return presupuesto.generarSaldo();}
}
