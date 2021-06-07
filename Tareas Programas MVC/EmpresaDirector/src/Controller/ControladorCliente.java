package Controller;

import Model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ControladorCliente 
{
    private List<Cliente>listaCliente;
    private Cliente okey;

    public ControladorCliente() {
        listaCliente = new ArrayList();
        okey = null;
    }
    public long generarId(){
    if(listaCliente.size()>0)
     return listaCliente.get(listaCliente.size()-1).getId()+1;
    else
     return 1;
    }
    public boolean crear(String nombre, String apellido,String cedula, String dirreccion, String telefono){
            Cliente a = new Cliente(this.generarId(), nombre, apellido,cedula, dirreccion,telefono); 
            return listaCliente.add(a);
    }
    public Cliente buscar(String cedula){
        for (Cliente cliente:listaCliente){
        if(cliente.getCedula().equals(cedula))
            return cliente;
        }
        return null;
    }
    public boolean actualizar(String nombre, String apellido,String cedula, String dirreccion,String telefono){
    Cliente cliente = this.buscar(cedula);
    if(cliente!=null){
    int posicion = listaCliente.indexOf(cliente);
    cliente.setNombre(nombre);
    cliente.setApellido(apellido);
    cliente.setDirreccion(dirreccion);
    cliente.setTelefono(telefono);
    listaCliente.set(posicion, cliente);
    return true;
    }
    return false;
    }
    public boolean eliminar (String cedula){
        Cliente cliente=this.buscar(cedula);
        if(cliente !=null){
           return listaCliente.remove(cliente);
        }return false;
    }

    public List<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(List<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    public Cliente getOkey() {
        return okey;
    }

    public void setOkey(Cliente okey) {
        this.okey = okey;
    }
    
}
