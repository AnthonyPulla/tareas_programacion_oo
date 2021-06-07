package Model;

import java.util.ArrayList;
import java.util.List;

public class Empresa
{
    private long id;
    private String nombre;
    private List<Cliente>listadoCliente;
    private List<Empleado>listadoEmpleado;
    private List<EmDirectivo>listadoEmDirectivo;
    
    public Empresa(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.listadoCliente = new ArrayList();
        this.listadoEmpleado = new ArrayList();
        listadoEmDirectivo = new ArrayList();
    }

    public Empresa(long id, String nombre, List<Cliente> listadoCliente, List<Empleado> listadoEmpleado) {
        this.id = id;
        this.nombre = nombre;
        this.listadoCliente = listadoCliente;
        this.listadoEmpleado = listadoEmpleado;

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

    public List<Cliente> getListadoCliente() {
        return listadoCliente;
    }

    public void setListadoCliente(List<Cliente> listadoCliente) {
        this.listadoCliente = listadoCliente;
    }

    public List<Empleado> getListadoEmpleado() {
        return listadoEmpleado;
    }

    public void setListadoEmpleado(List<Empleado> listadoEmpleado) {
        this.listadoEmpleado = listadoEmpleado;
    }

    public List<EmDirectivo> getListadoEmDirectivo() {
        return listadoEmDirectivo;
    }

    public void setListadoEmDirectivo(List<EmDirectivo> listadoEmDirectivo) {
        this.listadoEmDirectivo = listadoEmDirectivo;
    }

    @Override
    public String toString() {
        return "Empresa{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
}
