package Model;
import java.util.ArrayList;
import java.util.List;
public class Aula {
    private long id;
    private String descripcion;
    private List<Grupo>ListGrup;
    
    public Aula(long id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.ListGrup = new ArrayList();
    }

    public Aula(long id, String descripcion, List<Grupo> ListGrup) {
        this.id = id;
        this.descripcion = descripcion;
        this.ListGrup = ListGrup;
    }
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Grupo> getListGrup() {
        return ListGrup;
    }

    public void setListGrup(List<Grupo> ListGrup) {
        this.ListGrup = ListGrup;
    }
    
    @Override
    public String toString() {
        return "Aula{" + "id=" + id + ", descripcion=" + descripcion + '}';
    }  
}
