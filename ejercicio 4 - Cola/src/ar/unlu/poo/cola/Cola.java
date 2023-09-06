package ar.unlu.poo.cola;

public class Cola {
    private Nodo primero = null;
    private Nodo ultimo = null;

    public boolean estaVacio(){
        return primero==null;
    }

    public int longitud(){
        int n=0;
        if(this.estaVacio()){
            return n;
        }else{
            Cola c = new Cola();

            do{
                n++;
                c.encolar(this.desencolar());
            }while(!this.estaVacio());

            do{
                this.encolar(c.desencolar());
            }while(!c.estaVacio());
        }
        return n;
    }

    public void encolar(Object dato){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setdato(dato);

        if (this.estaVacio()){
            primero = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            ultimo.setproximo(nuevoNodo);
            ultimo = nuevoNodo;
        }
    }

    public Object desencolar(){
        if (this.estaVacio()) {
            return null;
        }

        Object dato = primero.getdato();
        primero = primero.getproximo();

        if (this.estaVacio()){
            ultimo = null;
        }

        return dato;
    }

    public Object recuperar(){
        if (this.estaVacio()) {
            return null;
        }
        return primero.getdato();
    }

    public void mostrar() {
        Nodo actual = primero;
        System.out.println("mostrando lista");

        while (actual != null) {
            System.out.println(actual.getdato());
            actual = actual.getproximo();
        }
        System.out.println();
    }
}
