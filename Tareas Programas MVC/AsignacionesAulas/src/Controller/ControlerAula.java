    package Controller;
import java.util.List;
import java.util.ArrayList;
import Model.Aula;
import Model.Grupo;
import vista.VistaAula;

public class ControlerAula {
    private List<Aula>lisAu;
    private Aula seleccion;
    
    public ControlerAula(){
    lisAu = new ArrayList();
    seleccion = null;
    }
    public long GID(){
    if(lisAu.size()>0)
        return lisAu.get(lisAu.size()-1).getId()+1;
    return 1;
    }
    public boolean crear(String descripcion){
     return lisAu.add(new Aula(this.GID(), descripcion));
    }
    public Aula buscar(String descripcion){
    for(Aula aula:lisAu){
        if(aula.getDescripcion().equals(descripcion))
            return aula;
        }    
    return null;
    }
    public boolean actualizar(String descripcion){
    Aula aula = buscar(descripcion);
    if(aula!=null){
    int position = lisAu.indexOf(aula);
    aula.setDescripcion(descripcion);
    lisAu.set(position, aula);
        return true;
        }
    return false;
    }
    public boolean eliminar(String descripcion){
        return lisAu.remove(buscar(descripcion));
    }
    public boolean agregarGrupo(Grupo grupo){
        return seleccion.getListGrup().add(grupo);
    }

    public List<Aula> getLisAu() {
        return lisAu;
    }

    public void setLisAu(List<Aula> lisAu) {
        this.lisAu = lisAu;
    }

    public Aula getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(Aula seleccion) {
        this.seleccion = seleccion;
    }
    
}
