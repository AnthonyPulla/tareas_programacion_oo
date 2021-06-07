package controlador;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import modelo.Auto;
public class AutoControlador {
    private List<Auto>listaAuto;
    private Auto seleccionado;
    
 public AutoControlador(){
        listaAuto = new ArrayList();
        seleccionado = null;
    }
    public long generarId(){
        if(listaAuto.size() > 0) { 
            return listaAuto.get(listaAuto.size() -1 ).getId() + 1; 
        }else {
            return 1;
        }
    }
    
    public boolean crear(String placa, String marca, String modelo){
        Auto auto = new Auto(this.generarId(), placa, marca, modelo);
        return this.listaAuto.add(auto);
    }
    public boolean crear(String placa, String marca, String modelo, Cliente propietario){
        Auto auto = new Auto(this.generarId(), placa, marca, modelo, propietario);
        propietario.getListaAuto().add(auto);
        return this.listaAuto.add(auto);
    }
    public Auto buscar(String placa){
        for (Auto auto : listaAuto) {
            if(auto.getPlaca().equals(placa)){
                return auto;
            }
        }
        return null;
    }
    public boolean actualizar(String placa, String marca, String modelo){
        Auto auto = this.buscar(placa);
        if(auto != null){
            int posicion = listaAuto.indexOf(auto);
            auto.setMarca(marca);
            auto.setModelo(modelo);
            listaAuto.set(posicion, auto);
            return true;
        }
        return false;
    }
    public boolean eliminar(String placa){
        Auto auto = this.buscar(placa);
        if(auto != null) {
            auto.getPropietario().getListaAuto().remove(auto);
            return listaAuto.remove(auto);
        }
        return false;
    }

    public List<Auto> getListaAuto() {
        return listaAuto;
    }

    public void setListaAuto(List<Auto> listaAuto) {
        this.listaAuto = listaAuto;
    }

    public Auto getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Auto seleccionado) {
        this.seleccionado = seleccionado;
    }

}
