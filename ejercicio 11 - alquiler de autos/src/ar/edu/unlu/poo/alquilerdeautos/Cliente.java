package ar.edu.unlu.poo.alquilerdeautos;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private int dni;

    public Cliente(String nombre){this.nombre=nombre;}

    private ArrayList<Alquiler> alquileres=new ArrayList<Alquiler>();

    public Float montoTotalAlquileres(){
        Float monto = 0.0f;

        if (alquileres==null){return monto;}

        for(int i=0 ;i<alquileres.size();i++){
            monto = monto + alquileres.get(i).generarSaldo();
        }

        return monto;
    }

    public void agregarAlquiler(Alquiler alquiler){alquileres.add(alquiler);}
}
