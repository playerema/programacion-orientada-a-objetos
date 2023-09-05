package ar.edu.unlu.poo.libro;

import java.util.ArrayList;

public class Biblioteca {
    public ArrayList<Libro> libros =new ArrayList<>();

    public Libro buscarAutor(String autor){
        Libro l;

        for(int i=0;i<libros.size();i++){
            if(libros.get(i).getAutor().equals(autor)){
                l = libros.get(i);
            }
        }

        return l;
    }

    public Libro buscarTitulo(String titulo){
        Libro l;

        for(int i=0;i<libros.size();i++){
            if(libros.get(i).getTitulo().equals(titulo)){
                l = libros.get(i);
            }
        }

        return l;
    }

    public boolean prestar(Libro l){

    }

    public Integer cantPrestamos(){return 0;}

    public void agregarLibro(){}

    public void agregarEjemplar(){}
}
