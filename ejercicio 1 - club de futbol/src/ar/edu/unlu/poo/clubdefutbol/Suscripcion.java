package ar.edu.unlu.poo.clubdefutbol;

public class Suscripcion {
    private tipo tipoDeSuscripcion;

    enum tipo{basica, intermedia, destacada};

    public Suscripcion(tipo tipoDeSuscripcion){
        this.tipoDeSuscripcion=tipoDeSuscripcion;
    }

    public tipo getTipoDeSuscripcion() {
        return tipoDeSuscripcion;
    }

    public void setTipoDeSuscripcion(tipo tipoDeSuscripcion) {
        this.tipoDeSuscripcion = tipoDeSuscripcion;
    }
}
