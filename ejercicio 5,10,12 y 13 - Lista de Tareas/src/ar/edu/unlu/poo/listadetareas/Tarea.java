package ar.edu.unlu.poo.listadetareas;
//diragrama de clase
/*
-------------------------------------------------------------------------------------------------
|        Tarea                                                                                  |
-------------------------------------------------------------------------------------------------
| - descripcion: String                                                                         |
| - prioridad: String                                                                           |
| - colaborador: String                                                                         |
| - completada: boolean                                                                         |
| - limite: LocalDate                                                                           |
| - recordatorio: LocalDate                                                                     |
| - finalizacion: LocalDate                                                                     |
-------------------------------------------------------------------------------------------------
| + Tarea(descripcion: String, prioridad: Prioridad, limite: LocalDate,recordatorio: LocalDate) |
| + Tarea(descripcion: String, prioridad: Prioridad, limite: LocalDate)                         |
| + Tarea(descripcion: String,prioridad Prioridad)                                              |
| + setDescripcion(Descripcion: String): void                                                   |
| + setPrioridad(nuevaPrioridad: String): void                                                  |
| + getPrioridad(): Prioridad                                                                   |
| + terminada(colaborador:String): void                                                         |
| + mostrar(): String                                                                           |
| - recordar(): boolean                                                                         |
| + Vencida(): boolean                                                                          |
| + Completa(): boolean                                                                         |
| + getColaborador(): String                                                                    |
| + getLimite: LocalDate                                                                        |
-------------------------------------------------------------------------------------------------
*/

//ejercicio 5
/*Una tarea es una acción que debe realizarse. Habitualmente todas las tareas que tenemos pendientes
las ponemos en una lista, y en la medida que las vamos cumpliendo, las vamos "tachando".
Queremos empezar a construir una app que gestione esta lista de tareas.
Una tarea es una descripción, que además contiene una prioridad y un estado (Si está completa o incompleta).
 Además, una tarea puede tener una fecha límite. Si la tarea sobrepasa esta fecha y su estado es incompleta,
  vamos a decir que la tarea está vencida.
A una tarea, le podemos modificar su descripción, cambiarle la prioridad y avisar que está terminada. Además,
 podemos querer mostrar la tarea, en cuyo caso muestra la descripción. Pero, si la tarea está terminada,
 el mensaje debería iniciar con el string "(Vencida)...".
A una tarea queremos poder preguntarle si se encuentra vencida o no, como así también le podemos consultar
 si está completa o no.

Se pide:

-Generar un diagrama de clase simple de la clase Tarea.
-Generar el código en Java que represente la tarea. Debe incluir todos los métodos derivados de la descripción.
-Generar un programa en Java que haga uso de la clase Tarea, y cree las siguientes tareas:

    "Ir al supermercado mañana". Debe tener la fecha límite establecida y estar incompleta.
    "Consultar repuesto del auto". Debe tener la fecha límite para ayer y estar completa.
    "Ir al cine a ver la nueva película de Marvel". Debe tener fecha límite de ayer y estar incompleta.

Este último programa debe configurar el estado especificado en cada objeto, y mostrar sus mensajes respectivos.
Tip: Es posible que deba revisar el funcionamiento de la clase java.time.LocalDate de Java.*/

//ejercicio 10
/*Queremos extender la clase Tarea que tuvimos que desarrollar como ejercicio en la clase introductoria.
Ahora se les puede establecer una fecha de recordatorio a las tareas, si esa fecha de recordatorio es
mayor o igual a la fecha actual entonces las tareas se van a imprimir con el prefijo “(por vencer)”.
Además, si la tarea se encuentra próxima a vencer (fecha posterior o igual a la del recordatorio)
la prioridad sube a la más alta.

Objetivos:

Definir estructura y comportamiento.
Implementar los cambios y realizar pruebas para verificar el correcto funcionamiento*/

//ejercicio 12
/*Necesitamos también crear un administrador de tareas para nuestra lista, que me permita crear nuevas tareas
y agregarlas a una lista. Se necesita que retorne la lista de tareas no vencidas ordenadas primero según
la prioridad y luego según la fecha de vencimiento. Debe permitir la búsqueda de tareas por título,
y dada una tarea poder marcarla como realizada.*/

//ejercicio 13
/*Seguimos extendiendo el ToDoList, se agregan nuevas funcionalidades.
Ahora las tareas pueden resolverlas varias personas, por lo cual una lista de tareas puede tener
varios colaboradores y una tarea, cuando se marca finalizada, será realizada por un colaborador.
Cuando la tarea se marca finalizada debería registrar la fecha de finalización. Se debe poder obtener
un listado de las tareas realizadas por un colaborador.
*/
import java.time.LocalDate;

public class Tarea {
    //ATRIBUTOS
    private String descripcion = "";
    private Prioridad prioridad;
    private String colaborador = "";
    private boolean estado=false;
    private LocalDate limite;
    private LocalDate recordatorio;
    private LocalDate finalizacion;


    //ENUMERADOR
    public enum Prioridad{
        muyBaja,
        baja,
        media,
        alta,
        muyAlta,
        urgente;
    }


    //CREADORES
    public Tarea(String descripcion,Prioridad prioridad,LocalDate limite,LocalDate recordatorio){
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.limite = limite;
        this.recordatorio = recordatorio;
    }

    public Tarea(String descripcion,Prioridad prioridad,LocalDate limite){
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.limite=limite;
    }

    public Tarea(String descripcion,Prioridad prioridad){
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.limite=limite;
    }


    //METODOS

    //setDescripcion: modifica el atributo descripción en el objeto tarea
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }

    //SetPrioridad: modifica el atributo prioridad en el objeto tarea
    public void setPrioridad(Prioridad prioridad){
        this.prioridad=prioridad;
    }
    //terminada: marcar la tarea como completa, guardando el colaborador y fecha de finalizacion
    public Prioridad getPrioridad(){return this.prioridad;}
    public void terminada(String colaborador){
        this.estado=true;
        this.colaborador=colaborador;
        this.finalizacion = LocalDate.now();
    }

    //mostrar: retorna la descripcion sumado una indicacion
    public String mostrar() {
        if (this.vencida()) {
            return "(vencido) " + descripcion;
        } else if(this.recordar()){//si recordatorio es hoy o mas tarde
            this.setPrioridad(Prioridad.urgente);
            return "(por vencer) " + descripcion;
        }else {
            return descripcion;
        }
    }

    //recordar:verifica si el recordatorio se cumple y aumentar la prioridad a urgente en tal caso
    private boolean recordar(){
        if (this.recordatorio!=null && this.recordatorio.compareTo(LocalDate.now())<=0){
            this.prioridad=Prioridad.urgente;
            return true;
        }else{
            return false;
        }
    }

    //vencida: verifica si la tarea esta vencida
     public boolean vencida(){
         LocalDate hoy = LocalDate.now();
         return !estado && limite.isBefore(hoy);
     }

     //completa: retorna un booleano con el estado de la tarea
     public boolean completa(){return this.estado;}

    public String getColaborador(){
        return this.colaborador;
    }

    public LocalDate getLimite() {
        return limite;
    }
}
