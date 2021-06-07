package sight;
import Controller.ControladorCliente;
import Controller.ControladorEmDirectivo;
import Controller.ControladorEmpleado;
import Controller.ControladorEmpresa;
import java.util.Scanner;

public class VistaGeneral {
    private Scanner teclado;
    private VistaEmpresa vistaEmpresa;
    private VistaCliente vistaCliente;
    private VistaEmpleado vistaEmpleado;
    private VistaDirectivo vistaDirectivo;  
    
    public VistaGeneral(){
        vistaCliente = new VistaCliente();
        vistaEmpleado = new VistaEmpleado();
        vistaDirectivo = new VistaDirectivo();
        vistaEmpresa = new VistaEmpresa(vistaCliente, vistaEmpleado, vistaDirectivo);
        teclado = new Scanner(System.in);
    }
    public void menu(){
        int opcion = 0;
        do {            
            System.out.println("1. Empresas");
            System.out.println("2. Salir");
            System.out.print("Elija una opccion: ");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1: vistaEmpresa.menu(); break;
            }
        } while (opcion<2);
    }  
}
