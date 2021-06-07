package Model;
public class Persona {
    private long id;
    private String nomCom;
    private Fecha fecha;
    private DNI dni;

    public Persona(long id, String nomCom) {
        this.id = id;
        this.nomCom = nomCom;
    }

    public Persona(long id, String nomCom, Fecha fecha, DNI dni) {
        this.id = id;
        this.nomCom = nomCom;
        this.fecha = fecha;
        this.dni = dni;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomCom() {
        return nomCom;
    }

    public void setNomCom(String nomCom) {
        this.nomCom = nomCom;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public DNI getDni() {
        return dni;
    }

    public void setDni(DNI dni) {
        this.dni = dni;
    }
    @Override
    public String toString() {
        return "Regis{" + "id=" + id + ", nomCom=" + nomCom + ", fecha=" + fecha + ", dni=" + dni + '}';
    }    
}
