import ar.edu.unlu.poo.listadetareas.ListaDeTareas;
import ar.edu.unlu.poo.listadetareas.Tarea;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ListaDeTareas l = new ListaDeTareas();
        LocalDate fecha;

        l.añadirColaborador("Emanuel Bogado");
        l.añadirColaborador("Felipe Pereiro");
        l.añadirColaborador("albert einstein");

        //"Ir al supermercado mañana". Debe tener la fecha límite establecida y estar incompleta.
        fecha = LocalDate.of(2024,2,13);
        l.agregar("Ir al supermercado mañana", Tarea.Prioridad.media,fecha);

        //"Consultar repuesto del auto". Debe tener la fecha límite para ayer y estar completa.
        fecha = LocalDate.now();
        fecha = fecha.minusDays(1);
        l.agregar("Consultar repuesto del auto", Tarea.Prioridad.media,fecha);
        l.terminada(1,"Emanuel Bogado");

        //"Ir al cine a ver la nueva película de Marvel". Debe tener fecha límite de ayer y estar incompleta.
        l.agregar("Ir al cine a ver la nueva película de Marvel", Tarea.Prioridad.media,fecha);

        //nuevas pruebas para demostrar que funciona el recordatorio
        System.out.println("PROBANDO EL METODO RECORDAR");
        l.agregar("terminar el trabajo practico",Tarea.Prioridad.media,LocalDate.of(2023,9,5),LocalDate.of(2023,9,2));
        l.mostrar();


        l.mostrarPorColaborador("Emanuel Bogado");
        l.mostrarNoVencidas();
    }
}