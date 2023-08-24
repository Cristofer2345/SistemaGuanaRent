package clases;

//Importaciones de las librerias
import java.util.ArrayList;

/**
 *
 * @author Sebastian Daniel Martinez
 * @author Jose Andres Cortes
 * @author Criztofer Angulo Lopez
 */
//Se crea la clase Vivienda
public class Vivienda {

    //Se declaran los atributos
    private long idVivienda;
    private String descripcion;
    private String direccion;
    private float mtsConstrucc;
    private float mtsLote;
    private String tipoConstruccion;
    private boolean cochera;
    private int cantHabitac;
    private float cantBanios;
    private String carretera;
    private int precioBase;
    private int depositoGarantia;
    private Propietario propietario = new Propietario(); //Se utilizo agregacion
    private String estado;

    //Metodos de contructor vacio
    public Vivienda() {
        this.idVivienda = 100;
        this.descripcion = "";
        this.direccion = "";
        this.mtsConstrucc = 0;
        this.mtsLote = 0;
        this.tipoConstruccion = "Baldosas";
        this.cochera = false;
        this.cantHabitac = 2;
        this.cantBanios = 1;
        this.carretera = "Lastre";
        this.precioBase = 0;
        this.depositoGarantia = 0;
        this.estado = "Disponible";
    }

    //Metodos Constructores con todos sus atributos
    public Vivienda(long  idVivienda, String descripcion, String direccion, float mtsConstrucc, float mtsLote, String tipoConstruccion, boolean cochera, int cantHabitac, float cantBanios, String carretera, int precioBase, int depositoGarantia,Propietario owner, String estado) {
        this.idVivienda = idVivienda;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.mtsConstrucc = mtsConstrucc;
        this.mtsLote = mtsLote;
        this.tipoConstruccion = tipoConstruccion;
        this.cochera = cochera;
        this.cantHabitac = cantHabitac;
        this.cantBanios = cantBanios;
        this.carretera = carretera;
        this.precioBase = precioBase;
        this.depositoGarantia = depositoGarantia;
        this.estado = estado;
        this.propietario = owner;
    }

    //Metodos get and set de los Atributos
    public long getIdVivienda() {
        return idVivienda;
    }

    public void setIdVivienda(int idVivienda) {
        this.idVivienda = idVivienda;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getMtsConstrucc() {
        return mtsConstrucc;
    }

    public void setMtsConstrucc(float mtsConstrucc) {
        this.mtsConstrucc = mtsConstrucc;
    }

    public float getMtsLote() {
        return mtsLote;
    }

    public void setMtsLote(float mtsLote) {
        this.mtsLote = mtsLote;
    }

    public String getTipoConstruccion() {
        return tipoConstruccion;
    }

    public void setTipoConstruccion(String tipoConstruccion) {
        this.tipoConstruccion = tipoConstruccion;
    }

    public boolean getCochera() {
        return cochera;
    }

    public void setCochera(Boolean cochera) {
        this.cochera = cochera;
    }

    public int getCantHabitac() {
        return cantHabitac;
    }

    public void setCantHabitac(int cantHabitac) {
        this.cantHabitac = cantHabitac;
    }

    public float getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(float cantBanios) {
        this.cantBanios = cantBanios;
    }

    public String getCarretera() {
        return carretera;
    }

    public void setCarretera(String carretera) {
        this.carretera = carretera;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public int getDepositoGarantia() {
        return depositoGarantia;
    }

    public void setDepositoGarantia(int depositoGarantia) {
        this.depositoGarantia = depositoGarantia;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    //Metodos de clase

}
