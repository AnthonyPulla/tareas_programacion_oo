package Model;
public class Empleado extends Persona
{
    private double sueldoBruto;
    public Empleado(long id, String nombre, String apellido,String cedula,String dirreccion, double sueldoBruto) {
        super(id, nombre, apellido,cedula,dirreccion);
        this.sueldoBruto = sueldoBruto;
    }
    public double getSueldoBruto() {
        return sueldoBruto;
    }
    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }
    @Override
    public String toString() {
        return "Empleado{"+ super.toString() + "sueldoBruto=" + sueldoBruto + '}';
    }
    
}
