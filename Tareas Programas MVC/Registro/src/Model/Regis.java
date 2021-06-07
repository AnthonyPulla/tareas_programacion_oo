package Model;
import java.util.Date;
public class Regis {
    private long id;
    private String codigo;
    private Date feReg;
    private Persona persona;        

    public Regis(long id, String codigo, Date feReg) {
        this.id = id;
        this.codigo = codigo;
        this.feReg = feReg;
    }
    public Regis(long id, String codigo, Date feReg, Persona persona) {
        this.id = id;
        this.codigo = codigo;
        this.feReg = feReg;
        this.persona = persona;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public Date getFeReg() {
        return feReg;
    }
    public void setFeReg(Date feReg) {
        this.feReg = feReg;
    }
    public Persona getPersona() {
        return persona;
    }
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    @Override
    public String toString() {
        return "Regis{" + "id=" + id + ", codigo=" + codigo + ", feReg=" + feReg + ", persona=" + persona + '}';
    }
}
