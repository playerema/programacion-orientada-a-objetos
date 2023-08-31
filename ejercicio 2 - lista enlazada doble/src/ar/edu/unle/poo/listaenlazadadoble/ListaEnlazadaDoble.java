package ar.edu.unle.poo.listaenlazadadoble;

public class ListaEnlazadaDoble {
    private Nodo inicio;

    public boolean esVacia(){
        return inicio ==null;
    }
    public int  longitud(){
        int n = 0;

        Nodo actual = inicio;

        while(actual!=null){
            n++;
            actual=actual.getSiguiente();
        }

        return n;
    }

    public void agregar(Object datos) {
        Nodo nuevoNodo = new Nodo(datos);

        if (this.esVacia()) {
            inicio = nuevoNodo;
        } else {
            Nodo nodoActual = inicio;

            while (nodoActual != null && nodoActual.getSiguiente() != null) {
                nodoActual = nodoActual.getSiguiente();
            }

            nodoActual.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(nodoActual);
        }
    }

    public Object recuperar(int indice) {
        if (indice < 0 || indice >= this.longitud()) {
            return null;
        }

        Nodo nodoActual = inicio;

        for (int i = 0; i < indice; i++) {
            nodoActual = nodoActual.getSiguiente();
        }

        return nodoActual.getDatos();
    }

    public void insertar(Object datos,int indice) {
        if (indice < 0 || indice > this.longitud()) {
            return;
        }

        if (indice == 0) {
            Nodo nuevoNodo = new Nodo(datos, inicio);

            if (inicio != null) {
                inicio.setAnterior(nuevoNodo);
            }
            inicio = nuevoNodo;
            return;
        }

        Nodo nuevoNodo = new Nodo(datos);
        Nodo nodoActual = inicio;

        for (int i = 0; i < indice - 1; i++) {
            nodoActual = nodoActual.getSiguiente();
        }

        nuevoNodo.setSiguiente(nodoActual.getSiguiente());
        nuevoNodo.setAnterior(nodoActual);
        if (nodoActual.getSiguiente() != null) {
            nodoActual.getSiguiente().setAnterior(nuevoNodo);
        }
        nodoActual.setSiguiente(nuevoNodo);
    }

    public void eliminar(Object datos) {
        if (inicio == null) {
            return;
        }

        if (inicio.getDatos().equals(datos)) {
            inicio = inicio.getSiguiente();
            if (inicio != null) {
                inicio.setAnterior(null);
            }
            return;
        }

        Nodo nodoActual = inicio;
        while (nodoActual != null) {

            if (nodoActual.getDatos().equals(datos)) {
                Nodo nodoAnterior = nodoActual.getAnterior();
                Nodo nodoSiguiente = nodoActual.getSiguiente();

                if (nodoAnterior != null) {
                    nodoAnterior.setSiguiente(nodoSiguiente);
                }

                if (nodoSiguiente != null) {
                    nodoSiguiente.setAnterior(nodoAnterior);
                }
                return;
            }
            nodoActual = nodoActual.getSiguiente();
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
