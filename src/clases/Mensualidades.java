package clases;

//Importacion de las librerias 
import java.time.Instant;
import java.time.LocalDate;

/**
 *
 * @author Sebastian Daniel Martinez
 * @author Jose Andres Cortes
 * @author Criztofer Angulo Lopez
 *
 */
//Se crea la clase Mensualidades
public class Mensualidades {

    //Se declaran los atributos
    private int consecutivo;
    private long numAlquiler; //El atributo pertenece a la clase Alquiler
    private LocalDate fechCreacion;
    private String nomInquilino;//El atributo pertenece a la clase Inquilinos
    private int mesCobro;
    private int anioActual;
    private int descuento;
    private float montoMes;
    private String estado;

    //Metodos de contructor vacio
    public Mensualidades() {
        this.consecutivo = 100;
        this.numAlquiler = 100;
        this.fechCreacion = null;   //LocalDate.from(Instant.now());
        this.nomInquilino = "";
        this.mesCobro = 1;
        this.anioActual = 2023;
        this.descuento = 0;
        this.montoMes = 100000;
        this.estado = "Pendiente";
    }

    //Metodos Constructores con todos sus atributos
    public Mensualidades(int consecutivo, long numAlquiler, LocalDate fechCreacion, String nomInquilino, int mesCobro, int anioActual, int descuento, float montoMes, String estado) {
        this.consecutivo = consecutivo;
        this.numAlquiler = numAlquiler;
        this.fechCreacion = fechCreacion;
        this.nomInquilino = nomInquilino;
        this.mesCobro = mesCobro;
        this.anioActual = anioActual;
        this.descuento = descuento;
        this.montoMes = montoMes;
        this.estado = estado;
    }

    //Metodos get and set de los Atributos
    public int getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }

    public long getNumAlquiler() {
        return numAlquiler;
    }

    public void setNumAlquiler(int numAlquiler) {
        this.numAlquiler = numAlquiler;
    }

    public LocalDate getFechCreacion() {
        return fechCreacion;
    }

    public void setFechCreacion(LocalDate fechCreacion) {
        this.fechCreacion = fechCreacion;
    }

    public String getNomInquilino() {
        return nomInquilino;
    }

    public void setNomInquilino(String nomInquilino) {
        this.nomInquilino = nomInquilino;
    }

    public int getMesCobro() {
        return mesCobro;
    }

    public void setMesCobro(int mesCobro) {
        this.mesCobro = mesCobro;
    }

    public int getAnioActual() {
        return anioActual;
    }

    public void setAnioActual(int anioActual) {
        this.anioActual = anioActual;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public float getMontoMes() {
        return montoMes;
    }

    public void setMontoMes(float montoMes) {
        this.montoMes = montoMes;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    //Metodos de clase
}
