import ar.edu.unlu.poo.libros.Biblioteca;
import ar.edu.unlu.poo.libros.Ejemplar;
import ar.edu.unlu.poo.libros.Libro;

/*
Definir responsabilidad, estructura y comportamiento de las clases.

Crear una clase que utilice a las anteriores y que cree 2 objetos Libro (los valores que se quieran),
mostrarlos por pantalla e indique cuál de los 2 tiene más páginas.

Intentar prestar un libro con 10 ejemplares y uno con 1 solo ejemplar.
Mostrar cantidad total hecha de préstamos.*/
public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("moby dick", "calamardo tentaculos", 350, 1850);
        Libro libro2 = new Libro("en las montañas de la locura", "hp lovecraft", 350, 1940);

        for(int i = 0;i<10;i++){
            Ejemplar ej = new Ejemplar();
            libro1.agregarejemplar(ej);
        }

        Ejemplar ej=new Ejemplar();

        libro2.agregarejemplar(ej);

        System.out.println(libro1.getDescripcion());
        System.out.println(libro2.getDescripcion());
        System.out.println();

        System.out.println("libro 1");
        libro1.prestar();
        System.out.println("cantidad de ejemplares prestados: " + libro1.cantidadDeEjemplaresPrestados());
        System.out.println("libro 2");
        libro2.prestar();
        System.out.println("cantidad de ejemplares prestados: " + libro2.cantidadDeEjemplaresPrestados());
        System.out.println();




    }
}