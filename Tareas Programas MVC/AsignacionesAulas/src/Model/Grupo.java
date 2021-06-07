package Model;
import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private long id;
    private String nombre;
    private List<Asignatura>lisAsig;
    
    public Grupo(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.lisAsig = new ArrayList();
    }

    public Grupo(long id, String nombre, List<Asignatura> listaAsignatura) {
        this.id = id;
        this.nombre = nombre;
        this.lisAsig = lisAsig;
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

    public List<Asignatura> getListaAsignatura() {
        return lisAsig;
    }

    public void setListaAsignatura(List<Asignatura> listaAsigantura) {
        this.lisAsig = lisAsig;
    }

    @Override
    public String toString() {
        return "Grupo{" + "id=" + id + ", nombre=" + nombre + '}';
    }

}
