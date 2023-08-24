package clases;

//Importacion de las librerias 
import java.time.LocalDate;

/**
 *
 * @author Sebastian Daniel Martinez
 * @author Jose Andres Cortes
 * @author Criztofer Angulo Lopez
 */
//Se crea la clase Alquileres

/**
 * 
 * 
 */
public class Alquileres {

    //Se declaran los atributos
    private long numAlquiler;
    private LocalDate fechContrato;
    private int cantMeses;
    private int numAdultos;
    private int numNinos;
    private int depositoGarantia;
    private int precioAlquiler;
    private int porcIncremAnual;
    private long cedInquilino;
    private long  idVivienda;
    private String estado;

    //Metodos de contructor vacio
    public Alquileres() {
        this.numAlquiler = 100;
        this.fechContrato =  null; //LocalDate.from(Instant.now());
        this.cantMeses = 1;
        this.numAdultos = 0;
        this.numNinos = 0;
        this.depositoGarantia = 0;
        this.precioAlquiler = 0;
        this.porcIncremAnual = 0;
        this.cedInquilino = 0;
        this.idVivienda = 100;
        this.estado = "Vigente";
    }

    //Metodos Constructores con todos sus atributos
    public Alquileres(long  numAlquiler, LocalDate fechContrato, int cantMeses, int numAdultos, int numNinos, int depositoGarantia, int precioAlquiler, int porcIncremAnual, long cedInquilino, long  idVivienda, String estado) {
        this.numAlquiler = numAlquiler;
        this.fechContrato = fechContrato;
        this.cantMeses = cantMeses;
        this.numAdultos = numAdultos;
        this.numNinos = numNinos;
        this.depositoGarantia = depositoGarantia;
        this.precioAlquiler = precioAlquiler;
        this.porcIncremAnual = porcIncremAnual;
        this.cedInquilino = cedInquilino;
        this.idVivienda = idVivienda;
        this.estado = estado;
    }

    //Metodos get and set de los Atributos
    public long getNumAlquiler() {
        return numAlquiler;
    }

    public void setNumAlquiler(int numAlquiler) {
        this.numAlquiler = numAlquiler;
    }

    public LocalDate getFechContrato() {
        return fechContrato;
    }

    public void setFechContrato(LocalDate fechContrato) {
        this.fechContrato = fechContrato;
    }

    public int getCantMeses() {
        return cantMeses;
    }

    public void setCantMeses(int cantMeses) {
        this.cantMeses = cantMeses;
    }

    public int getNumAdultos() {
        return numAdultos;
    }

    public void setNumAdultos(int numAdultos) {
        this.numAdultos = numAdultos;
    }

    public int getNumNinos() {
        return numNinos;
    }

    public void setNumNinos(int numNinos) {
        this.numNinos = numNinos;
    }

    public int getDepositoGarantia() {
        return depositoGarantia;
    }

    public void setDepositoGarantia(int depositoGarantia) {
        this.depositoGarantia = depositoGarantia;
    }

    public int getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public int getPorcIncremAnual() {
        return porcIncremAnual;
    }

    public void setPorcIncremAnual(int porcIncremAnual) {
        this.porcIncremAnual = porcIncremAnual;
    }

    public long getCedInquilino() {
        return cedInquilino;
    }

    public void setCedInquilino(int cedInquilino) {
        this.cedInquilino = cedInquilino;
    }

    public long getIdVivienda() {
        return idVivienda;
    }

    public void setIdVivienda(int idVivienda) {
        this.idVivienda = idVivienda;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    //Metodos de clase
}
