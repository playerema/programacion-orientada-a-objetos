package ar.edu.unlu.poo.listadetareas;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.*;

public class ListaDeTareas {
    private List<Tarea> lista = new ArrayList<>();

    private List<String> colaboradores = new ArrayList<>();

    public void añadirColaborador(String colaborador){
        colaboradores.add(colaborador);
    }

    private Tarea recuperar(int indice){
        return lista.get(indice);
    }

    public void agregar(String descripcion, Tarea.Prioridad prioridad, LocalDate limite, LocalDate recordatorio){
        Tarea tarea = new Tarea(descripcion,prioridad,limite,recordatorio);
        lista.add(tarea);
    }
    public void agregar(String descripcion, Tarea.Prioridad prioridad, LocalDate limite){
        Tarea tarea = new Tarea(descripcion,prioridad,limite);
        lista.add(tarea);
    }

    public void agregar(String descripcion, Tarea.Prioridad prioridad){
        Tarea tarea = new Tarea(descripcion,prioridad);
        lista.add(tarea);
    }

    public void terminada(int indice,String colaborador) {
        if (this.verificarColaborador(colaborador)) {
            lista.get(indice).terminada(colaborador);
        }
    }

    private boolean verificarColaborador(String colaborador){
        if(colaboradores.indexOf(colaborador)!=-1){
            return true;
        }else{
            return false;
        }
    }

    public void mostrarPorColaborador(String colaborador){
        System.out.println("mostrardo lista del colaborador "+ colaborador);

        for(int i = 0;i<lista.size();i++){
            if(lista.get(i).getColaborador().equals(colaborador)){
                System.out.println(i+"-"+lista.get(i).mostrar());
            }
        }
        System.out.println();
    }

    public void mostrar(){
        System.out.println("mostrando Lista:");
        for(int i = 0;i<lista.size();i++){
            System.out.println(i+ "-" + lista.get(i).mostrar());
        }
        System.out.println();
    }

    public void mostrarNoVencidas(){
        Comparator<Tarea> comparador = Comparator
                .comparing(Tarea::getPrioridad)
                .thenComparing(Tarea::getLimite)
                .reversed();

        List<Tarea> noVencidas= new ArrayList<>();

        for(int i = 0;i<lista.size();i++) {
            if (!lista.get(i).vencida()) {
                noVencidas.add(lista.get(i));
            }

        }
        Collections.sort(noVencidas,comparador);

        System.out.println("mostrando tareas no vencidas:");
        for(int j=0;j<noVencidas.size();j++){
            System.out.println(noVencidas.get(j).mostrar());
        }
        System.out.println();
    }
}
