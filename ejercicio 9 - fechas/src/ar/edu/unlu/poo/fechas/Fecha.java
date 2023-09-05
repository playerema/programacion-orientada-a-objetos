package ar.edu.unlu.poo.fechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*Ejercicio 9
Se requiere crear una clase que ayude a realizar operaciones con fechas. Las operaciones requeridas son:

Devolver una fecha a partir de un string, con un formato específico. Los formatos pueden ser 2:

dd-MM-yyyy
MM-dd-yyyy

Determinar si una fecha se encuentra entre otras dos fechas.
Determinar si una fecha es mayor a otra fecha.
Determinar si una fecha es menor a otra fecha.

Se pueden ayudar del paquete java.time
Objetivos:

Definir estructura y comportamiento.
Crear una clase que la utilice enviando mensajes para probar el correcto funcionamiento.*/

public class Fecha {
    private static final DateTimeFormatter ddMMyyFormatter = DateTimeFormatter.ofPattern("dd-MM-yy");
    private static final DateTimeFormatter MMddyyFormatter = DateTimeFormatter.ofPattern("MM-dd-yy");

    public static LocalDate obtenerFecha(String dateStr, String format) {
        if (format.equals("dd-MM-yy")) {
            return LocalDate.parse(dateStr, ddMMyyFormatter);
        } else if (format.equals("MM-dd-yy")) {
            return LocalDate.parse(dateStr, MMddyyFormatter);
        } else {
            throw new IllegalArgumentException("Formato de fecha no válido");
        }
    }

    //Determinar si una fecha se encuentra entre otras dos fechas.
    public boolean entreDosFechas(LocalDate fechaIntermedia,LocalDate fechaAnterior,LocalDate fechaPosterior){
        return fechaIntermedia.isAfter(fechaAnterior) && fechaIntermedia.isBefore(fechaPosterior);
    }
    //Determinar si una fecha es mayor a otra fecha.
    public boolean esMayor(LocalDate fecha,LocalDate fechaAnterior){
        return fecha.isAfter(fechaAnterior);
    }
    //Determinar si una fecha es menor a otra fecha.
    public boolean esMenor(LocalDate fechaIntermedia,LocalDate fechaPosterior){
        return fechaIntermedia.isBefore(fechaPosterior);
    }
}