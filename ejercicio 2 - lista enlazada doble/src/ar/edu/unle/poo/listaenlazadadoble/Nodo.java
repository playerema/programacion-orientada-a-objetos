package ar.edu.unle.poo.listaenlazadadoble;

public class Nodo {
    private Object datos;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo(Object obj,Nodo sig,Nodo ant){
        this.datos = obj;
        this.siguiente = sig;
        this.anterior = ant;

    }

    public Nodo(Object obj,Nodo sig){
        this.datos = obj;
        this.siguiente = sig;

    }
   public Nodo(Object obj){
       this.datos = obj;
   }

    public Nodo(){
        this.datos = null;
    }

    public void setDatos(Object obj) {
        datos = obj;
    }

    public void setSiguiente(Nodo nodo) {
        siguiente = nodo;
    }

    public void setAnterior(Nodo nodo) {
        anterior = nodo;
    }

    public Object getDatos() {
        return datos;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }
}