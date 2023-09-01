package ar.edu.unlu.poo.ecuacion;

/*Se requiere implementar una clase que represente y pueda resolver una ecuación de segundo grado.
Dada una ecuación de segundo grado de la forma y = a * x^2 + b * x + c, la fórmula para el cálculo de
las raíces es (-b ± √((b^2) - (4 * a * c))) / (2 * a). Una vez que se crea una instancia de la clase
no se podrán modificar sus coeficientes. Recordar que puede darse el caso donde exista una única raíz
 y para que esto ocurra el discriminante ((b^2) - 4 * a * c) debe ser igual a 0. En este último caso,
 en vez de retornar 2 raíces se debería retornar una sola. Existe el caso también donde necesitemos
 calcular el valor de y con base en el valor de x, que se pasa como parámetro.
 */
public class Ecuacion{
    private final Float a;
    private final Float b;
    private final Float c;

    public Ecuacion(Float a,Float b,Float c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    private boolean unaRaiz(){
        return (Math.pow(b,2) - 4 * a * c)==0;
    }

    private boolean dosRaiz(){
        return (Math.pow(b,2) - 4 * a * c)>0;
    }

    private boolean sinRaiz(){
        return ((Math.pow(b,2) - 4 * a * c)<0);
    }

    public int cantidadRaices(){
        if(this.unaRaiz()){
            return 1;
        } else if (this.dosRaiz()) {
            return 2;
        }
        return 0;
    }
    public double discriminante(){
        return (Math.pow(b,2) - 4 * a * c);
    }

    public Raiz solucion() {
        Raiz sol = new Raiz();
        if (this.sinRaiz()) {
            return sol;
        }

        if(this.unaRaiz()) {

            sol.setRaiz1( (-b + Math.pow( this.discriminante() , 0.5) )/ (2*a) );
            sol.setRaiz2( sol.getRaiz1() );
        } else if (this.dosRaiz()) {
            sol.setRaiz1( (-b + Math.pow( this.discriminante() , 0.5) )/ (2*a) );
            sol.setRaiz2( (-b - Math.pow( this.discriminante() , 0.5) )/ (2*a) );
        }
        return sol;
    }
}

