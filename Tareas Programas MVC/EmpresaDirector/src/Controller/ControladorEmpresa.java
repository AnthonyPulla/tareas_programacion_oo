package Controller;

import java.util.ArrayList;
import java.util.List;
import Model.Cliente;
import Model.Empleado;
import Model.Empresa;

public class ControladorEmpresa {
    private List<Empresa>listaEmpresa;
    private Empresa seleccion;
    
    public ControladorEmpresa(){
    listaEmpresa=new ArrayList();
    seleccion=null;
    }
public long generarId(){
    if(listaEmpresa.size()>0)
         return listaEmpresa.get(listaEmpresa.size()-1).getId()+1;
    return 1;
    }
public boolean crear(String nombre){
     return listaEmpresa.add(new Empresa(generarId(), nombre));
}
public Empresa buscar(String nombre){
for(Empresa empresa:listaEmpresa){
    if(empresa.getNombre().equals(nombre))
        return empresa;
}
return null;
}
public boolean actualizar( String nombreAnterior, String Nombre){
    Empresa empresa = buscar(nombreAnterior);
    if(empresa!=null){
    int position=listaEmpresa.indexOf(empresa);
    empresa.setNombre(nombreAnterior);
    listaEmpresa.set(position,empresa);
    return true;
    }
   return false;       
 }
public boolean eliminar(String nombre){
        return listaEmpresa.remove(buscar(nombre));
    }
public boolean agregarEmpleado(Empleado empleado){
        return seleccion.getListadoEmpleado().add(empleado);
    }
public boolean agregarCliente(Cliente cliente){
        return seleccion.getListadoCliente().add(cliente);
    }
public List<Empresa> getListaEmpresa() {
        return listaEmpresa;
    }

    public void setListaEmpresa(List<Empresa> listaEmpresa) {
        this.listaEmpresa = listaEmpresa;
    }

    public Empresa getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(Empresa seleccion) {
        this.seleccion = seleccion;
   }

}

