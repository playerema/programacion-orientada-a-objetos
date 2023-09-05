import ar.edu.unlu.poo.fechas.Fecha;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        LocalDate fecha1= LocalDate.of(2023,10,1);
        LocalDate fecha2= LocalDate.of(2023,10,2);
        LocalDate fecha3= LocalDate.of(2023,10,3);
        Fecha f= new Fecha();


        Fecha.obtenerFecha("01-02-23","MM-dd-yy");
        Fecha.obtenerFecha("01-02-23","dd-MM-yy");

        if(f.entreDosFechas(fecha2,fecha1,fecha3)){
            System.out.println("esta entre dos fechas");
        }else{
            System.out.println("no esta entre dos fechas");
        }

        if(f.esMayor(fecha2,fecha1)){
            System.out.println("fecha 2 es mayor a fecha 1");
        }else{
            System.out.println("fecha 2 no es mayor a fecha 1");
        }

        if(f.esMenor(fecha2,fecha3)){
            System.out.println("fecha 2 es menor a fecha 3");
        }else{
            System.out.println("fecha 2 no es menor a fecha 3");
        }

        if(f.esMayor(fecha2,fecha3)){
            System.out.println("fecha 2 es mayor a fecha 3");
        }else{
            System.out.println("fecha 2 no es mayor a fecha 3");
        }

        if(f.esMenor(fecha2,fecha1)){
            System.out.println("fecha 2 es menor a fecha 1");
        }else{
            System.out.println("fecha 2 no es menor a fecha 1");
        }
    }
}