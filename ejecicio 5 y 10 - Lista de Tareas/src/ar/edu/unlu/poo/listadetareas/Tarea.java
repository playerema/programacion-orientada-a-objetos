package ar.edu.unlu.poo.listadetareas;


/*
---Ahora se les puede establecer una fecha de recordatorio a las tareas,---

si esa fecha de recordatorio es mayor o igual a la fecha actual entonces las tareas se van
a imprimir con el prefijo “(por vencer)”.

si la tarea se encuentra próxima a vencer (fecha posterior o igual a la del recordatorio)
la prioridad sube a la más alta.*/

import java.time.LocalDate;

public class Tarea {
    private String descripcion = "";
    private Prioridad prioridad;
    private boolean estado=false;
    private LocalDate limite;
    private LocalDate recordatorio;

    public Tarea(String descripcion,Prioridad prioridad,LocalDate limite,LocalDate recordatorio){
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.limite = limite;
        this.recordatorio = recordatorio;
    }

    public Tarea(String descripcion,Prioridad prioridad,LocalDate limite){
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.limite=limite;
    }

    public Tarea(String descripcion,Prioridad prioridad){
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.limite=limite;
    }

    public enum Prioridad{
        muyBaja,
        baja,
        media,
        alta,
        muyAlta,
        urgente;
    }

    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }

    public void setPrioridad(Prioridad prioridad){
        this.prioridad=prioridad;
    }

    public Prioridad getPrioridad(){
        return this.prioridad;
    }

    public void terminada(){this.estado=true;}

    public String mostrar() {
        if (this.vencida()) {
            return "(vencido) " + descripcion;
        } else if(this.recordar()){//si recordatorio es hoy o mas tarde
            this.setPrioridad(Prioridad.urgente);
            return "(por vencer) " + descripcion;
        }else {
            return descripcion;
        }
    }

    public boolean recordar(){
        return this.recordatorio!=null && this.recordatorio.compareTo(LocalDate.now())>=0;
    }

    //A una tarea queremos poder preguntarle si se encuentra vencida o no, como así también le podemos consultar
    //si está completa o no.
     public boolean vencida(){
         LocalDate hoy = LocalDate.now();
         return !estado && limite.isBefore(hoy);
     }

    //como así también le podemos consultar si está completa o no.
     public boolean completa(){return this.estado;}
}
