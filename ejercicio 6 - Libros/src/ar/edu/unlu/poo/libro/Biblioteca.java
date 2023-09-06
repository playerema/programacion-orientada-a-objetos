package ar.edu.unlu.poo.libro;

import java.util.ArrayList;

public class Biblioteca {
    public ArrayList<Libro> libros =new ArrayList<>();

    public Libro buscarPorAutor(String autor){
        Libro l=new Libro("","",0,0,0);

        for(int i=0;i<libros.size();i++){
            if(libros.get(i).getAutor().equals(autor)){
                l = libros.get(i);
            }
        }

        return l;
    }

    public Libro buscarPorTitulo(String titulo){
        Libro l=new Libro("","",0,0,0);

        for(int i=0;i<libros.size();i++){
            if(libros.get(i).getTitulo().equals(titulo)){
                l = libros.get(i);
            }
        }

        return l;
    }

    public boolean prestar(Libro l){
        return l.prestar();
    }

    public Integer cantidadPrestamos(Libro libro){return libro.getNumeroDeEjemplaresPrestados();}

}
