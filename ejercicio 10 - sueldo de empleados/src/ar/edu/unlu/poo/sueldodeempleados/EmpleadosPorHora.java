package ar.edu.unlu.poo.sueldodeempleados;

public class EmpleadosPorHora extends Empleado{

    private Float horas;

    private Float sumaPorHora;

    @Override
    public Float calcularSueldo() {
        if(horas<=40.0f){
            return horas*sumaPorHora + bonoDeCumpleaños();
        }else{
            return (horas*sumaPorHora*1.20f) + bonoDeCumpleaños();
        }
    }
}
