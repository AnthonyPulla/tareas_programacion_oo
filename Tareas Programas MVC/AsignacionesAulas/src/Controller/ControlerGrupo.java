package Controller;
import java.util.List;
import java.util.ArrayList;
import Model.Grupo;
import Model.Asignatura;
public class ControlerGrupo {
    private List<Grupo> lisGru;
    private Grupo seleccion;
    public ControlerGrupo(){
        lisGru = new ArrayList();
        seleccion = null;
    }
    public long GID(){
    if(lisGru.size()>0)
        return lisGru.get(lisGru.size()-1).getId()+1;
    return 1;
    }
    public boolean crear(String nombre){
     return lisGru.add(new Grupo(this.GID(), nombre));
    }
    public Grupo buscar(String nombre){
    for(Grupo grupo:lisGru){
    if(grupo.getNombre().equals(nombre))
        return grupo;
        }
    return null;
    }
    public boolean actualizar(String nombre){
    Grupo grupo = buscar(nombre);
    if(grupo!=null){
    int positiopn = lisGru.indexOf(grupo);
    grupo.setNombre(nombre);
    lisGru.set(positiopn,grupo);
    return true;
    }
    return false;
    }
    public boolean eliminar(String nombre){
        return lisGru.remove(buscar(nombre));
    }
    public boolean agregarAsignatura(Asignatura asignatura){
        return seleccion.getListaAsignatura().add(asignatura);
    }

    public List<Grupo> getLisGru() {
        return lisGru;
    }

    public void setLisGru(List<Grupo> lisGru) {
        this.lisGru = lisGru;
    }

    public Grupo getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(Grupo seleccion) {
        this.seleccion = seleccion;
    }    
}
