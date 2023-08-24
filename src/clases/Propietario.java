package clases;

/**
 * @author Sebastian Daniel Martinez
 * @author Jose Andres Cortes
 * @author Criztofer Angulo Lopez
 */
//Se crea la clase Propietario que hereda de la clase Persona que es el padre
public class Propietario extends Persona {

    //Metodos Constructores con todos sus atributos
    public Propietario(long cedula, String nombre, char genero, String direccion, String telefono, String email) {
        super(cedula, nombre, genero, direccion, telefono, email);
    }

    //Metodos de contructor vacio 
    public Propietario() {
        super();
    }
}
