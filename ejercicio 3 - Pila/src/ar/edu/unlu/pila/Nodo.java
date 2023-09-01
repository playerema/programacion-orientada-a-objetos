package ar.edu.unlu.pila;

public class Nodo {
    private Object dato;
    private Nodo proximo;

    public Nodo(){
        this.proximo = null;
    }

    public Nodo(Object dato){
        this.dato = dato;
        this.proximo = null;
    }

    public Nodo(Object dato,Nodo proximo){
        this.dato = dato;
        this.proximo = proximo;
    }

    public void setdato(Object dato){
        this.dato=dato;
    }

    public Object getdato(){
        return dato;
    }

    public void setproximo(Nodo proximo){
        this.proximo=proximo;
    }

    public Nodo getproximo(){
        return proximo;
    }
}
