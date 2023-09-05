package ar.edu.unlu.poo.libros;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros = new ArrayList<>();

    public ArrayList<String> buscarPorAutor(String autor){
        ArrayList<String> resultado=new ArrayList<>();

        for(int i = 0;i< libros.size();i++){
            if(libros.get(i).getAutor().equals(autor)){
                resultado.add(libros.get(i).getAutor());
            }
        }
        return resultado;
    }

    public ArrayList<String> buscarPorTitulo(String titulo){
        ArrayList<String> resultado = new ArrayList<>();

        for(int i = 0;i< libros.size();i++){
            if(libros.get(i).getTitulo().equals(titulo)){
                resultado.add(libros.get(i).getTitulo());
            }
        }
        return resultado;
    }
}
