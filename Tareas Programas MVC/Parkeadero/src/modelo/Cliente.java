package modelo;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private long id;
    private String nombre;
    private String apellido;
    private String cedula;
    private Empresa empresa;
    private List<Auto> listaAuto;

    public Cliente() {
        this.id = -1;
    }

    public Cliente(long id, String nombre, String apellido, String cedula) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.listaAuto = new ArrayList();
    }

    public Cliente(long id, String nombre, String apellido, String cedula, Empresa empresa, List<Auto> listaAuto) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.empresa = empresa;
        this.listaAuto = listaAuto;
    }

    public Cliente(long id, String nombre, String apellido, String cedula, Empresa empresa) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.empresa = empresa;
        this.listaAuto = new ArrayList();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public List<Auto> getListaAuto() {
        return listaAuto;
    }

    public void setListaAuto(List<Auto> listaAuto) {
        this.listaAuto = listaAuto;
    }     
    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", Empresa=" + empresa + '}';
    }    
}