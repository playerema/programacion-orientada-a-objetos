package ar.edu.unlu.poo.libros;
/*
Necesitamos implementar la clase Libro para un sistema de administración de bibliotecas y
todas las clases relacionadas que correspondan. Generalmente las búsquedas se hacen por Título o Autor,
es casi imposible que quieran buscar un libro por ISBN y en ciertos casos no se tiene el dato para completarlo.
Si solo queda un Ejemplar disponible, no se puede prestar el libro porque tiene que quedar disponible para
consultar dentro de la biblioteca. El sistema debería mostrar la descripción del libro como: El libro
<su_titulo> creado por el autor <su_autor> tiene <num_paginas> páginas, quedan <num_ejemplares> disponibles
y se prestaron <num_ejemplares_prestados>. También se necesita determinar la cantidad de préstamos realizados,
teniendo en cuenta todos los libros disponibles.
Objetivos:

Definir responsabilidad, estructura y comportamiento de las clases.
Crear una clase que utilice a las anteriores y que cree 2 objetos Libro (los valores que se quieran), mostrarlos por pantalla e indique cuál de los 2 tiene más páginas.
Intentar prestar un libro con 10 ejemplares y uno con 1 solo ejemplar.
Mostrar cantidad total hecha de préstamos.*/
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
        this.autor=autor;
        this.isbn=isbn;
        this.paginas=paginas;
        this.anio=anio;

    }

    public Libro(String titulo,String autor,Integer paginas,Integer anio){
        this.titulo=titulo;
        this.autor=autor;
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

    public int cantidadDeEjemplaresPrestados(){
        int n=0;

        for(int i = 0;i<ejemplares.size();i++){
            if(ejemplares.get(i).getPrestado()){
                n++;
            }
        }
        return n;
    }

    public int cantidadDeEjemplares(){
        int n=0;

        for(int i = 0;i<ejemplares.size();i++){
            if(!ejemplares.get(i).getPrestado()){
                n++;
            }
        }
        return n;
    }

    public String getDescripcion(){
        return "El libro " + titulo + " creado por el autor " + autor + " tiene " + paginas + " páginas, quedan " + this.cantidadDeEjemplares() + " disponibles y se prestaron "+ this.cantidadDeEjemplaresPrestados();
    }

    public void agregarejemplar(Ejemplar ejemplar){
        ejemplares.add(ejemplar);
    }

    public void prestar(){
        if(this.cantidadDeEjemplares()>1){

            for(int i = 0;i<ejemplares.size();i++){

                if(!ejemplares.get(i).getPrestado()){
                    ejemplares.get(i).setPrestado();
                    i=ejemplares.size();
                }
            }

        }else{
            System.out.println("No se puede prestar. No hay ejemplares disponibles");
        }
    }

    public void prestar(Ejemplar ejemplar){
        if(this.cantidadDeEjemplares()>1){

            for(int i = 0;i<ejemplares.size();i++){

                if(ejemplares.get(i).equals(ejemplar)){
                    ejemplares.get(i).setPrestado();
                    i=ejemplares.size();
                }
            }

        }else{
            System.out.println("No se puede prestar. No esta el ejemplar elegido");
        }
    }

    public void devolver(Ejemplar ejemplar){
        for(int i = 0;i<ejemplares.size();i++) {
            if (ejemplares.get(i).equals(ejemplar)){
                ejemplares.get(i).setPrestado();
                i=ejemplares.size();
            }
        }
    }
}
