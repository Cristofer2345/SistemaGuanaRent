package clases;

/**
 * @author Sebastian Daniel Martinez
 * @author Jose Andres Cortes
 * @author Criztofer Angulo Lopez
 */
//Se crea la clase Persona que es el padre 
public abstract class Persona   {

    //Se declaran los atributos
    public long  cedula;
    protected String nombre;
    protected char genero;
    protected String direccion;
    protected String telefono;
    protected String email;

    //Metodos de contructor vacio 
    public Persona() {
        this.cedula = 0;
        this.nombre = "";
        this.genero = 'F';
        this.direccion = "";
        this.telefono = "";
        this.email = "";
    }

    //Metodos Constructores con todos sus atributos
    public Persona(long   cedula, String nombre, char genero, String direccion, String telefono, String email) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.genero = genero;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    //Metodos get and set de los Atributos
    public long getCedula() {
        return cedula;
    }

    public void setCedula(int  cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Metodos de clase
   
}
