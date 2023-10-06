package ar.edu.unlu.poo.alquilerdeautos;

import java.util.Collection;
import java.util.Iterator;

public class Vehiculo {
    private static Collection<String> patentesUsadas= new Collection<String>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<String> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(String s) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends String> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }
    };

    private String patente;
    private boolean prestado;

    private int diasDeAlquiler;

    public Vehiculo(String patente){
        if(patentesUsadas.contains(patente)){
            throw new IllegalArgumentException("La patente ya está en uso.");
        }
        this.patente = patente;
        patentesUsadas.add(patente);
        prestado=false;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getPatente() {
        return patente;
    }

    public void prestado() {
        this.prestado = true;
    }

    public void devuelto() {
        this.prestado = false;
    }

    public boolean getPrestado() {
        return prestado;
    }

    protected int generarPresupuesto() {
        return 3000;
    }

    public int getDiasDeAlquiler() {
        return diasDeAlquiler;
    }

    public void setDiasDeAlquiler(int diasDeAlquiler) {
        this.diasDeAlquiler = diasDeAlquiler;
    }
}
