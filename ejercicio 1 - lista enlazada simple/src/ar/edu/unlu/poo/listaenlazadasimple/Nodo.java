package ar.edu.unlu.poo.listaenlazadasimple;

public class Nodo{
    private Object datos;
    private Nodo siguiente = null;

    public Nodo(Object obj){
        this.datos = obj;
    }

    public Nodo(Object obj,Nodo nd){
        this.datos = obj;
        this.siguiente = nd;
    }

    public void setDatos(Object dato){
        this.datos = dato;
    }

    public Object getDatos(){
        return this.datos;
    }

    public void setSiguiente(Nodo nodo){
        this.siguiente=nodo;
    }

    public Nodo getSiguiente(){
        return this.siguiente;
    }
}