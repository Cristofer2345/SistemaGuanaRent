package clases;

//Importacion de las librerias
import java.time.LocalDate;

/**
 *
 * @author Sebastian Daniel Martinez
 * @author Jose Andres Cortes
 * @author Criztofer Angulo Lopez
 *
 */
//Se crea la clase Inquilino que hereda de la clase Persona que es el padre
public class Inquilino extends Persona {

    //Se declaran los atributos
    private LocalDate fechNac;
    private String ocupacion;

    //Metodos Constructores con todos sus atributos
    public Inquilino( long   cedula, String nombre, char genero, String direccion, String telefono, String email, LocalDate fechNac, String ocupacion) {
        super(cedula, nombre, genero, direccion, telefono, email);
        this.fechNac = fechNac;
        this.ocupacion = ocupacion;
    }

    //Metodos de contructor vacio 
    public Inquilino() {
        super();
       this.fechNac = null;
        this.ocupacion = "";
    }

    //Metodos de get and set

    public LocalDate getFechNac() {
        return fechNac;
    }

    public void setFechNac(LocalDate fechNac) {
        this.fechNac = fechNac;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
}
