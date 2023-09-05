package ar.edu.unlu.poo.libros;

import java.util.ArrayList;

public class Libro {
    //ATRIBUTOS
    private ArrayList<Ejemplar> ejemplares = new ArrayList<>();
    private String titulo;
    private String autor;
    private String isbn;
    private Integer paginas;
    private Integer anio;

    //CONSTRUCTORES
    public Libro(String titulo,String autor,Integer paginas,Integer anio,String isbn){
        this.titulo=titulo;
        this.autor=titulo;
        this.isbn=isbn;
        this.paginas=paginas;
        this.anio=anio;

    }

    public Libro(String titulo,String autor,Integer paginas,Integer anio){
        this.titulo=titulo;
        this.autor=titulo;
        this.paginas=paginas;
        this.anio=anio;
    }

    //METODOS
    public String getAutor(){
        return this.autor;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String mostrar(){
        return "";
    }
}
