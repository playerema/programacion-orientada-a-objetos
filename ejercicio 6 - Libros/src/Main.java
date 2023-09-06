import ar.edu.unlu.poo.libro.Libro;

public class Main {
    public static void main(String[] args){
        Libro libro1 = new Libro("Libro 1", "Autor 1", 300,1968, 10);
        Libro libro2 = new Libro("Libro 2", "Autor 2", 250,2022, 1);

        System.out.println("Información del Libro 1:");
        System.out.println(libro1.getDescripcion());

        System.out.println("Información del Libro 2:");
        System.out.println(libro2.getDescripcion());

        if (libro1.getPaginas() > libro2.getPaginas()) {
            System.out.println("El Libro 1 tiene más páginas que el Libro 2.");
        } else if (libro1.getPaginas() < libro2.getPaginas()) {
            System.out.println("El Libro 2 tiene más páginas que el Libro 1.");
        } else {
            System.out.println("Ambos libros tienen la misma cantidad de páginas.");
        }

        System.out.println("Intentando prestar el Libro 1:");
        libro1.prestar();

        System.out.println("Intentando prestar el Libro 2:");
        libro2.prestar();

        System.out.println("Cantidad total de préstamos realizados: " + (libro1.getNumeroDeEjemplaresPrestados() + libro2.getNumeroDeEjemplaresPrestados()));
    }
}