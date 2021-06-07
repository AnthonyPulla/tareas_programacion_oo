package Model;
public class Persona
{
    private long id;
    private String nombre;
    private String apellido;
    private String cedula;
    private String dirreccion;   

    public Persona(long id, String nombre, String apellido,String cedula, String dirreccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula=cedula;
        this.dirreccion = dirreccion;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDirreccion() {
        return dirreccion;
    }

    public void setDirreccion(String dirreccion) {
        this.dirreccion = dirreccion;
    }

    @Override
    public String toString() {
        return "{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", dirreccion=" + dirreccion + '}';
    }
    
}

