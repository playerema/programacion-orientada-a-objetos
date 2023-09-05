package ar.edu.unlu.poo.libro;
/*Necesitamos implementar la clase Libro para un sistema de administración de bibliotecas y todas las clases relacionadas que correspondan.
Generalmente las búsquedas se hacen por Título o Autor, es casi imposible que quieran buscar un libro por ISBN y en ciertos casos no se tiene
el dato para completarlo. Si solo queda un Ejemplar disponible, no se puede prestar el libro porque tiene que quedar disponible para consultar
dentro de la biblioteca. El sistema debería mostrar la descripción del libro como: El libro <su_titulo> creado por el autor <su_autor> tiene
 <num_paginas> páginas, quedan <num_ejemplares> disponibles y se prestaron <num_ejemplares_prestados>. También se necesita determinar la cantidad
 de préstamos realizados, teniendo en cuenta todos los libros disponibles.
Objetivos:

Definir responsabilidad, estructura y comportamiento de las clases.
Crear una clase que utilice a las anteriores y que cree 2 objetos Libro (los valores que se quieran), mostrarlos por pantalla e indique cuál
de los 2 tiene más páginas.
Intentar prestar un libro con 10 ejemplares y uno con 1 solo ejemplar.
Mostrar cantidad total hecha de préstamos.*/
public class Libro {

    private String titulo;
    private String autor;
    private String isbn;
    private Integer paginas;
    private Integer año;
    private Integer numEjemplares;
    private Integer numEjemplaresPrestados;

    //CONSTRUCTOR
    public Libro(String titulo,String autor,Integer paginas,Integer año,Integer numEjemplares,String isbn){
        this.titulo=titulo;
        this.autor=autor;
        this.paginas=paginas;
        this.año=año;
        this.isbn=isbn;
        this.numEjemplares=numEjemplares;
    }

    public Libro(String titulo,String autor,Integer paginas,Integer año,Integer numEjemplares){
        this.titulo=titulo;
        this.autor=autor;
        this.paginas=paginas;
        this.año=año;
        this.numEjemplares=numEjemplares;

    }

    //METODOS
    public String getDescripcion() {
        return "El libro " + titulo + " creado por el autor " + autor + " tiene " + paginas + " páginas, quedan " + numEjemplares + " disponibles y se prestaron " + numEjemplaresPrestados + ".";
    }

    public String getTitulo(){return this.titulo;}

    public String getAutor(){return this.autor;}

    public void prestar(){
        if (numEjemplares>0) {
            numEjemplares--;
            numEjemplaresPrestados++;
        }else{
            System.out.println("No hay ejemplares disponibles para prestar.");
        }
    }

    public int getNumEjemplaresPrestados() {
        return numEjemplaresPrestados;
    }

    public void devolver(){}

    }

}
