package ar.edu.unlu.poo.libros;

public class Ejemplar {

    private Integer nro;
    private Libro libro;
    private boolean prestado = false;
    public void setPrestado() {
        this.prestado = !this.prestado;
    }
    public boolean getPrestado(){return prestado;}

    public void setLibro(Libro libro){this.libro=libro;}
    public Libro getLibro(){return this.libro;}
}
