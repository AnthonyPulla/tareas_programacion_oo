package Controller;
import java.util.ArrayList;
import java.util.List;
import Model.Asignatura;
public class ControlerAsignatura {
    private Asignatura seleccion;
    private List<Asignatura>lisAsig;
    public ControlerAsignatura(){
        seleccion = null;
        lisAsig = new ArrayList();
    }
    public long GID(){
    if(lisAsig.size()>0)
        return lisAsig.get(lisAsig.size()-1).getId()+1;
    return 1;
    }
    public boolean crear(String nombre){
    return lisAsig.add(new Asignatura(this.GID(), nombre));
    }
    public Asignatura buscar(String nombre){
    for(Asignatura asig:lisAsig){
        if(asig.getNombre().equals(nombre))
            return asig;
        }    
    return null;   
    }
    public boolean actualizar(String nombre){
    Asignatura asig = buscar(nombre);
    if(asig!=null){
    int position = lisAsig.indexOf(asig);
    asig.setNombre(nombre);
    lisAsig.set(position, asig);
        return true;
        }
    return false;
    }
    public boolean eliminar(String nombre){
        return lisAsig.remove(buscar(nombre));
    }

    public Asignatura getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(Asignatura seleccion) {
        this.seleccion = seleccion;
    }

    public List<Asignatura> getLisAsig() {
        return lisAsig;
    }

    public void setLisAsig(List<Asignatura> lisAsig) {
        this.lisAsig = lisAsig;
    }

}
