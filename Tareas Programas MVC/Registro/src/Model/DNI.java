package Model;
public class DNI {
    private long id;
    private String numero;
    private int codigoVerificacion;

    public DNI(long id, String numero , int codigoVerificacion) {
        this.id = id;
        this.numero = numero;
        this.codigoVerificacion = codigoVerificacion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String nombre) {
        this.numero = nombre;
    }

    public int getCodigoVerificacion() {
        return codigoVerificacion;
    }

    public void setCodigoVerificacion(int codigoVerificacion) {
        this.codigoVerificacion = codigoVerificacion;
    }

    @Override
    public String toString() {
        return "DNI{" + "id=" + id + ", nombre=" + numero + ", codigoVerificacion=" + codigoVerificacion + '}';
    }
   
}

