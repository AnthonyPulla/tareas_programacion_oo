package Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import Model.DNI;
import Model.Fecha;
import Model.Persona;
import Model.Regis;

public class ControladorRegistro {
    private List<Regis> listaRegistro;
    private Regis seleccionado;
    
    public ControladorRegistro(){
        listaRegistro = new ArrayList<>();
    }
     public long generarId(){
        return (listaRegistro.size() >0)? listaRegistro.get(listaRegistro.size() - 1).getId() + 1 : 1;
    }
    public boolean crear(String codigo, Date fechaRegistro, Persona persona){
        return listaRegistro.add(new Regis(generarId(), codigo, fechaRegistro, persona));
    }
    public Regis buscar(String codigo){
        for (Regis registro : listaRegistro) {
            if(registro.getCodigo().equals(codigo)){
                seleccionado = registro;
                return registro;
            }
        }
        return null;
    }
    public boolean actualizar(String codigo, Date fechaRegistro, Persona persona){
        Regis registro = buscar(codigo);
        if(registro != null){
            int posicion = listaRegistro.indexOf(registro);
            registro.setFeReg(fechaRegistro);
            registro.setPersona(persona);
            listaRegistro.set(posicion, registro);
            return true;
        }
        return false;
    }
    public boolean eliminar(String codigo){
        Regis registro = buscar(codigo);
        return listaRegistro.remove(registro);
    }

    public List<Regis> getListaRegistro() {
        return listaRegistro;
    }

    public void setListaRegistro(List<Regis> listaRegistro) {
        this.listaRegistro = listaRegistro;
    }

    public Regis getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Regis seleccionado) {
        this.seleccionado = seleccionado;
    }
    
}
