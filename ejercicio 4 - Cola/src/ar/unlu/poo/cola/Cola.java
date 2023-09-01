package ar.unlu.poo.cola;

public class Cola {
    private Nodo primero = null;
    private Nodo ultimo = null;

    public boolean esvacio(){
        return primero==null;
    }

    public int longitud(){
        int n=0;
        if(this.esvacio()){
            return n;
        }else{
            Cola c = new Cola();

            do{
                n++;
                c.encolar(this.desencolar());
            }while(!this.esvacio());

            do{
                this.encolar(c.desencolar());
            }while(!c.esvacio());
        }
        return n;
    }

    public void encolar(Object dato){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setdato(dato);

        if (this.esvacio()){
            primero = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            ultimo.setproximo(nuevoNodo);
            ultimo = nuevoNodo;
        }
    }

    public Object desencolar(){
        if (this.esvacio()) {
            return null;
        }

        Object dato = primero.getdato();
        primero = primero.getproximo();

        if (this.esvacio()){
            ultimo = null;
        }

        return dato;
    }

    public Object recuperar(){
        if (this.esvacio()) {
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
