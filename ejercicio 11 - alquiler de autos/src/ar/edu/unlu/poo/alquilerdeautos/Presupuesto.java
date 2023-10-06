package ar.edu.unlu.poo.alquilerdeautos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Presupuesto {
    private Vehiculo vehiculo;
    private LocalDate inicioAlquiler;
    private LocalDate finalAlquiler;

    public Presupuesto(Vehiculo vehiculo,LocalDate inicioAlquiler,LocalDate finalAlquiler){
        this.vehiculo=vehiculo;
        this.finalAlquiler=finalAlquiler;
        this.inicioAlquiler=inicioAlquiler;
    }

    public int diasAlquilado(){return (int) ChronoUnit.DAYS.between(inicioAlquiler, finalAlquiler);}

    public int generarSaldo(){
        vehiculo.setDiasDeAlquiler(diasAlquilado());
        return vehiculo.generarPresupuesto();}

    public Alquiler generarAlquiler(Cliente cliente){return new Alquiler(cliente,this);}

    public LocalDate getInicioAlquiler() {
        return inicioAlquiler;
    }

    public void setInicioAlquiler(LocalDate inicioAlquiler) {
        this.inicioAlquiler = inicioAlquiler;
    }

    public LocalDate getFinalAlquiler() {
        return finalAlquiler;
    }

    public void setFinalAlquiler(LocalDate finalAlquiler) {
        this.finalAlquiler = finalAlquiler;
    }
}
