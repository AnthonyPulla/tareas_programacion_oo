package sight;
import java.util.Scanner;
import Model.Cliente;
import Controller.ControladorCliente;
public class VistaCliente {
    ControladorCliente ConCli;
    Scanner teclado;
    public  VistaCliente(){
        ConCli = new ControladorCliente();
        teclado = new Scanner(System.in);        
    }
    public void menu(){
        int option = 0;
        do {
            System.out.println("");
            System.out.println("1. Crear");
            System.out.println("2. Actualizar");
            System.out.println("3. Buscar");
            System.out.println("4. Eliminar");
            System.out.println("5. Listar");
            System.out.println("6. Salir");
            System.out.print("Elija una opccion: ");
            option = teclado.nextInt();
            switch(option){
                case 1: crear(); break;
                case 2: actualizar(); break;
                case 3: buscar(); break;
                case 4: eliminar(); break;
                case 5: listar(); break;
            }
        } while (option<6);
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
        System.out.println("Ingrese el telefono");
        String telefono = teclado.next();
        System.out.println("Resultado: " + ConCli.crear(nombre, apellido, cedula, direccion, telefono));
    }
    public Cliente buscar(){
        System.out.println("Ingrese el cedula");
        String cedula = teclado.next();
        Cliente cliente = ConCli.buscar(cedula);
        ConCli.setOkey(cliente);
        System.out.println(cliente);
        return cliente;
    }
    public void actualizar(){
        Cliente cliente = buscar();
        if(cliente != null){
            System.out.println("Ingrese el nombre");
            String nombre = teclado.next();
            System.out.println("Ingrese el apellido");
            String apellido = teclado.next();
            System.out.println("Ingrese el direccion");
            String direccion = teclado.next();
            System.out.println("Ingrese el telefono");
            String telefono = teclado.next();
            System.out.println("Resultado: " +ConCli.actualizar(nombre, apellido, cliente.getCedula(), direccion, telefono));
        }
    }
    public void eliminar(){
        Cliente cliente = buscar();
        if(cliente != null)
            System.out.println("Resultado: " + ConCli.eliminar(cliente.getCedula()));
    }
    public void listar(){
        for (Cliente cliente: ConCli.getListaCliente()) 
            System.out.println(cliente);
    }    

    public ControladorCliente getConCli() {
        return ConCli;
    }

    public void setConCli(ControladorCliente ConCli) {
        this.ConCli = ConCli;
    }
    
}
