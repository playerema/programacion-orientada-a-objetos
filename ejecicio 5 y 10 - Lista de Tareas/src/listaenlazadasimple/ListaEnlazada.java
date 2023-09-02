package listaenlazadasimple;

public class ListaEnlazada {
    Nodo inicio = null;

    /*Consultar si la lista está vacía.*/
    public boolean esVacia(){return inicio==null;}

    /*Consultar la longitud de la lista.*/
    public int longitud(){
        Nodo actual = inicio;
        int n = 0;

        while (actual != null) {
            n++;
            actual = actual.getSiguiente();
        }

        return n;
    }

    /*Agregar elemento al final de la lista.*/
    public void agregar(Object dato) {
        Nodo nuevoNodo = new Nodo(dato);

        if (this.esVacia()){

            inicio = nuevoNodo;
        }else{

            Nodo actual = inicio;

            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);

        }
    }

    /*Eliminar elemento de la lista.*/
    public void eliminar(Object dato) {
        if (this.esVacia()) {
            return;
        }

        if (inicio.getDatos().equals(dato)) {
            inicio = inicio.getSiguiente();
            return;
        }

        Nodo actual = inicio;

        while (actual.getSiguiente() != null && !actual.getSiguiente().getDatos().equals(dato)) {
            actual = actual.getSiguiente();
        }

        if (actual.getSiguiente() != null) {
            actual.setSiguiente(actual.getSiguiente().getSiguiente());
        }
    }


    public void eliminar(int indice) {
        if (indice < 0 || indice >= this.longitud()) {
            return;
        }
        if (indice == 0) {
            inicio = inicio.getSiguiente();
        } else {

            Nodo actual = inicio;

            for (int i = 0; i < indice - 1; i++) {
                actual = actual.getSiguiente();
            }

            actual.setSiguiente(actual.getSiguiente().getSiguiente());
        }
    }

    /*Recuperar elemento de la lista.*/
    public Object recuperar(int indice){
        if (indice < 0 || indice >= this.longitud()) {
            return null;
        }

        Nodo actual = inicio;

        for (int i = 0; i < indice; i++) {
            actual = actual.getSiguiente();
        }

        return actual.getDatos();
    }

    /*Insertar elemento en la lista en una posición específica.*/
    public void insertar(Object dato,int indice){
        if (indice < 0 || indice > this.longitud()) {
            return;
        }

        if (indice == 0) {
            Nodo nodoNuevo = new Nodo(dato);
            nodoNuevo.setSiguiente(inicio);
            inicio = nodoNuevo;
        } else {
            Nodo actual = inicio;

            for (int i = 0; i < indice - 1; i++) {
                actual = actual.getSiguiente();
            }

            Nodo nodoNuevo = new Nodo(dato);
            nodoNuevo.setSiguiente(actual.getSiguiente());
            actual.setSiguiente(nodoNuevo);
        }
    }

    public void mostrar(){
        Nodo actual = inicio;
        System.out.println("Mostrando Lista: ");

        while (actual != null && actual.getDatos() != null) {
            System.out.println(actual.getDatos());
            actual = actual.getSiguiente();
        }
        System.out.println();
    }
}





