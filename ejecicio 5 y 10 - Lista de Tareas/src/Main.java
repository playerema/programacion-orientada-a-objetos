import ar.edu.unlu.poo.listadetareas.Tarea;
import listaenlazadasimple.ListaEnlazada;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada l = new ListaEnlazada();
        LocalDate fecha;

        //"Ir al supermercado mañana". Debe tener la fecha límite establecida y estar incompleta.
        fecha = LocalDate.of(2024,2,13);
        Tarea t = new Tarea("Ir al supermercado mañana", Tarea.Prioridad.media,fecha);
        l.agregar(t);

        //"Consultar repuesto del auto". Debe tener la fecha límite para ayer y estar completa.
        fecha = LocalDate.now();
        fecha = fecha.minusDays(1);
        t = new Tarea("Consultar repuesto del auto", Tarea.Prioridad.media,fecha);
        t.terminada();

        l.agregar(t);

        //"Ir al cine a ver la nueva película de Marvel". Debe tener fecha límite de ayer y estar incompleta.
        t = new Tarea("Ir al cine a ver la nueva película de Marvel", Tarea.Prioridad.media,fecha);
        l.agregar(t);

        t = (Tarea) l.recuperar(0);
        System.out.println(t.mostrar());
        t = (Tarea) l.recuperar(1);
        System.out.println(t.mostrar());
        t = (Tarea) l.recuperar(2);
        System.out.println(t.mostrar());
        System.out.println();
        System.out.println();

        //nuevas pruebas para demostrar que funciona el recordatorio
        System.out.println("PROBANDO EL METODO RECORDAR");
        t = new Tarea("terminar el trabajo practico",Tarea.Prioridad.media,LocalDate.of(2023,9,5),LocalDate.of(2023,9,2));
        System.out.println("la prioridadantes antes del metodo recordar es: " + t.getPrioridad());
        System.out.println(t.mostrar());
        System.out.println("la prioridadantes despues del metodo recordar es: " + t.getPrioridad());

    }
}