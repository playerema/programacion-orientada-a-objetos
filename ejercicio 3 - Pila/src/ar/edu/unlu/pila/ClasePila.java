package ar.edu.unlu.pila;

public class ClasePila {
    //atributos
    private Nodo tope = null ;

    //metodos

    //EsVacio: comprueba sí la propia pila este vacía +++
    public boolean estaVacio(){
        return tope==null;
    }

    public int longitud(){
        if (this.estaVacio()) {
            return 0;
        }else{
            ClasePila aux = new ClasePila();
            int n=0;

            do{
                n++;
                Nodo naux = new Nodo(this.desapilar());
                aux.apilar(naux);

            }while (!this.estaVacio());

            do{
                Nodo naux = new Nodo(aux.desapilar());
                this.apilar(naux);

            }while (!aux.estaVacio());
            return n;
        }
    }

    //Apilar: añade un nuevo nodo en la sima de la Pila +++
    public void apilar(Object obj){
        Nodo nodo = new Nodo();
        nodo.setdato(obj);

        if (this.estaVacio()){
            this.tope = nodo;
        }else{
            Nodo naux = this.tope;//establece un nodo auxiliar y almacena el tope
            nodo.setproximo(naux);//convierte el tope almacenado en el siguiente del nodo
            this.tope=nodo;//almacena el nodo como tope
        }
    }

    //Desapilar: quita el elemento de la cima de la Pila +++
     public Object desapilar(){
        if (this.estaVacio()){
            return null;
        }

        Object baux = this.tope.getdato();//establece un nodo y almacenas el tope en el nodo auxiliar
        this.tope = this.tope.getproximo();
        return baux;
     }

    //Tope: devuelve la information de un nodo +++
    public Object recuperar(){

        if (!this.estaVacio()){return this.tope.getdato();}
        else{return null;}
    }

    //Mostrar: muestrar los elementos de la pila listados desde el tope hacia el fondo +++
    public void mostrar(){
        System.out.println("mostrando lista:");

        if (this.estaVacio()) {
            System.out.println("Lista Vacia");

        }else{

            ClasePila aux = new ClasePila();

            do{
                Nodo naux = new Nodo(this.desapilar());
                System.out.println(naux.getdato());
                aux.apilar(naux);

            }while (!this.estaVacio());

            do{
                Nodo naux = new Nodo(aux.desapilar());
                this.apilar(naux);

            }while (!aux.estaVacio());
        }
        System.out.println();
    }
}
