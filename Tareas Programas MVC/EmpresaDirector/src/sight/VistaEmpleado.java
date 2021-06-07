package sight;
import Controller.ControladorCliente;
import Controller.ControladorEmpleado;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Model.Cliente;
import Model.Empleado;
import Model.Empresa;
public class VistaEmpleado {
    public ControladorEmpleado controladorEmpleado;
    public Scanner teclado;
    public VistaEmpleado(){
        controladorEmpleado = new ControladorEmpleado();
        teclado = new Scanner(System.in);    
    }
    public void menu(){
        int opcion = 0;
        do {        
            System.out.println("");
            System.out.println("1. Crear");
            System.out.println("2. Actualizar");
            System.out.println("3. Buscar");
            System.out.println("4. Eliminar");
            System.out.println("5. Listar");
            System.out.println("6. Salir");
            System.out.print("Elija una opccion: ");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1: crear(); break;
                case 2: actualizar(); break;
                case 3: buscar(); break;
                case 4: eliminar(); break;
                case 5: listar(); break;
            }
        } while (opcion<6);
    }
    public void crear(){
        System.out.println("Ingrese el nombre");
        String nombre = teclado.next();
        System.out.println("Ingrese el apellido");
        String apellido = teclado.next();
        System.out.println("Ingrese el cedula");
        String cedula = teclado.next();
        System.out.println("Ingrese el direccion");
        String direccion = teclado.next();
        System.out.println("Ingrese el sueldo");
        double sueldo = teclado.nextDouble();
        System.out.println("Resultado: " + controladorEmpleado.crear(nombre, apellido, cedula, direccion, sueldo));
    }
    public Empleado buscar(){
        System.out.println("Ingrese el cedula");
        String cedula = teclado.next();
        Empleado empleado = controladorEmpleado.buscar(cedula);
        controladorEmpleado.setSeleccionado(empleado);
        System.out.println(empleado);
        return empleado;
    }
    public void actualizar(){
        Empleado empleado = buscar();
        if(empleado != null){
            System.out.println("Ingrese el nombre");
            String nombre = teclado.next();
            System.out.println("Ingrese el apellido");
            String apellido = teclado.next();
            System.out.println("Ingrese el direccion");
            String direccion = teclado.next();
            System.out.println("Ingrese el sueldo");
            double sueldo = teclado.nextDouble();
            System.out.println("Resultado: " +controladorEmpleado.actualizar(nombre, apellido, empleado.getCedula(), direccion, sueldo));
        }
    }
    public void eliminar(){
        Empleado empleado = buscar();
        if(empleado != null)
            System.out.println("Resultado: " + controladorEmpleado.eliminar(empleado.getCedula()));
    }
    public void listar(){
        for (Empleado empleado : controladorEmpleado.getListaEmpleado()) 
            System.out.println(empleado);
    }

    public ControladorEmpleado getControladorEmpleado() {
        return controladorEmpleado;
    }

    public void setControladorEmpleado(ControladorEmpleado controladorEmpleado) {
        this.controladorEmpleado = controladorEmpleado;
    }
    
 }
