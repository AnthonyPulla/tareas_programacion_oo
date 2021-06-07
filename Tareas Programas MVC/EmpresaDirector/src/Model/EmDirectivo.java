package Model;
public class EmDirectivo extends Empleado{
    private String categoria;

    public EmDirectivo(long id, String nombre, String apellido, String cedula, String dirreccion, double sueldoBruto,String categoria) {
        super(id, nombre, apellido, cedula, dirreccion, sueldoBruto);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

 
    @Override
    public String toString() {
        return "Directivo{" +super.toString()+ "categoria=" + categoria +super.toString()+ '}';
    }  
}
