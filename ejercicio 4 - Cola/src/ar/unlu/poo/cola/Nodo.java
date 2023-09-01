package ar.unlu.poo.cola;

public class Nodo {
    private Object dato = null;
    private Nodo proximo = null;

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
