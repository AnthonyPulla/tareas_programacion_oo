package Controller;

import Model.EmDirectivo;
import java.util.ArrayList;
import java.util.List;

public class ControladorEmDirectivo 
{
    private List<EmDirectivo>listaDirectivo;
    private EmDirectivo seleccion;
    
    public ControladorEmDirectivo(){
    this.listaDirectivo=new ArrayList();
    this.seleccion=null;
    }
public long generarId(){
    if(listaDirectivo.size()>0)
     return listaDirectivo.get(listaDirectivo.size()-1).getId()+1;
    return 1;
    }
public boolean crear(String nombre, String apellido, String cedula, String dirreccion, double sueldoBruto,String categoria){
    EmDirectivo directivo = new EmDirectivo(this.generarId(),nombre,apellido, cedula, dirreccion,sueldoBruto,categoria);
    return listaDirectivo.add(directivo);
}
public EmDirectivo buscar(String cedula){
for(EmDirectivo directivo:listaDirectivo){
    if(directivo.getCedula().equals(cedula))
        return directivo;
}
return null;
}
public boolean actualizar( String nombre, String apellido,String cedula, String dirreccion, double sueldoBruto,String categoria){
    EmDirectivo directivo = buscar(cedula);
    if(directivo!=null){
    int position=listaDirectivo.indexOf(directivo);
    directivo.setApellido(apellido);
    directivo.setNombre(nombre);
    directivo.setSueldoBruto(sueldoBruto);
    directivo.setDirreccion(dirreccion);
    directivo.setCategoria(categoria);
    listaDirectivo.set(position, directivo);
    return true;
    }
   return false;       
 }
public boolean eliminar(String Cedula){
            EmDirectivo directivo=this.buscar(Cedula);
        if(directivo !=null){
              return listaDirectivo.remove(directivo);  
        }
        return false;
    }

    public List<EmDirectivo> getListaDirectivo() {
        return listaDirectivo;
    }

    public void setListaDirectivo(List<EmDirectivo> listaDirectivo) {
        this.listaDirectivo = listaDirectivo;
    }

    public EmDirectivo getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(EmDirectivo seleccion) {
        this.seleccion = seleccion;
    }

}
