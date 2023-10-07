package ar.edu.unlu.poo.clubdefutbol;

import java.util.ArrayList;
import java.util.Calendar;

public class Sistema{

    private Sistema unicoSistema;

    private ArrayList<Socio> socios;

    private ArrayList<Actividad> actividades;

    private Sistema(){
        this.socios=new ArrayList<Socio>();
    }

    public void generarSistema() {
        if (unicoSistema == null) {
            unicoSistema = new Sistema();
        }
    }

    private void registrarSocio(Socio socio){
        socios.add(socio);
    }

    public ArrayList<Socio> reporteNuevosSocios(){
        ArrayList<Socio> resultado=new ArrayList<Socio>();
        Calendar cal = Calendar.getInstance();
        int mesActual = cal.get(Calendar.MONTH);


        for(int i=0;i<socios.size();i++){

            if(socios.get(i).getFechaDeInscripcion().equals(mesActual)){
                resultado.add(socios.get(i));
            }
        }

        return resultado;
    }

    public ArrayList<Actividad> listadoDeActividades(){
        ArrayList<Actividad> resultado = new ArrayList<Actividad>();

        for(int i=0;i< actividades.size();i++){
            if(actividades.get(i).getTipoDeSuscripcion().equals(Suscripcion.tipo.basica)){
                resultado.add(actividades.get(i));
            }
        }

        for(int i=0;i< actividades.size();i++){
            if(actividades.get(i).getTipoDeSuscripcion().equals(Suscripcion.tipo.intermedia)){
                resultado.add(actividades.get(i));
            }
        }

        for(int i=0;i< actividades.size();i++){
            if(actividades.get(i).getTipoDeSuscripcion().equals(Suscripcion.tipo.destacada)){
                resultado.add(actividades.get(i));
            }
        }

        return resultado;
    }

    public ArrayList<Socio> listaDeSocio(){
        ArrayList<Socio> resultado=new ArrayList<Socio>();

        for(int i=0;i< socios.size();i++){
            if(socios.get(i).getSuscripcion().getTipoDeSuscripcion().equals(Suscripcion.tipo.basica)){
                resultado.add(socios.get(i));
            }
        }

        for(int i=0;i< socios.size();i++){
            if(socios.get(i).getSuscripcion().getTipoDeSuscripcion().equals(Suscripcion.tipo.intermedia)){
                resultado.add(socios.get(i));
            }
        }

        for(int i=0;i< socios.size();i++){
            if(socios.get(i).getSuscripcion().getTipoDeSuscripcion().equals(Suscripcion.tipo.destacada)){
                resultado.add(socios.get(i));
            }
        }

        return resultado;
    }
}
