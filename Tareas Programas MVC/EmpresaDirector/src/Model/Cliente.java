package Model;
public class Cliente extends Persona
{
    private String telefono;
    public Cliente(long id, String nombre, String apellido,String cedula, String dirreccion, String telefono) {
        super(id, nombre, apellido,cedula, dirreccion);
        this.telefono = telefono;
    }
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{"+super.toString()+ "telefono=" + telefono +super.toString()+ '}';
    }
}
