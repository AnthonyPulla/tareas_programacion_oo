package sight;

import Controller.ControladorCliente;
import Controller.ControladorEmpleado;
import Controller.ControladorEmpresa;
import java.util.Scanner;
import Model.Cliente;
import Model.Empleado;
import Model.Empresa;

public class VistaEmpresa {
    private ControladorEmpresa controladorEmpresa;
    private VistaCliente vistaCliente;
    private VistaEmpleado vistaEmpleado;
    private VistaDirectivo vistaDirectivo;
    private Scanner teclado;    
    public VistaEmpresa(VistaCliente vistaCliente, VistaEmpleado vistaEmpleado, VistaDirectivo vistaDirectivo) {
        controladorEmpresa = new ControladorEmpresa();
        this.vistaCliente = vistaCliente;
        this.vistaEmpleado = vistaEmpleado;
        this.vistaDirectivo = vistaDirectivo;
        teclado = new Scanner(System.in);
    }
    public void menu() {
        int opcion = 0;
        do {
            System.out.println("");
            System.out.println("1. Crear");
            System.out.println("2. Actualizar");
            System.out.println("3. Buscar");
            System.out.println("4. Eliminar");
            System.out.println("5. Listar");
            System.out.println("6. Gestionar cliente");
            System.out.println("7. Gestionar empleado");
            System.out.println("8. Gestionar directivo");
            System.out.println("9. Salir");
            System.out.print("Elija una opccion: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:crear(); break;
                case 2:actualizar();break;
                case 3:buscar();break;
                case 4:eliminar();break;
                case 5:listar();break;
                case 6:cliente();break;
                case 7:empleado();break;
                case 8:directivo();break;
            }
        } while (opcion < 8);
    }
    public void crear() {
        System.out.println("Ingrese nombre de la empresa a crear ");
        String nombre = teclado.next();
        System.out.println("Resultado: " + controladorEmpresa.crear(nombre));
    }

    public Empresa buscar() {
        System.out.println();
        for (Empresa empresa : controladorEmpresa.getListaEmpresa()) {
        System.out.println(empresa);
        }
        System.out.print("Seleccione una empresa creada");
        String nombre = teclado.next();
        Empresa empresa = controladorEmpresa.buscar(nombre);
        controladorEmpresa.setSeleccion(empresa);
        System.out.println(empresa);
        return empresa;
    }

    public void actualizar() {
        Empresa empresa = buscar();
        System.out.println("Ingrese nombre nuevo de la empresa");
        String nombreNuevo = teclado.next();
        System.out.println("Resultado: " + controladorEmpresa.actualizar(empresa.getNombre(), nombreNuevo));
    }

    public void eliminar() {
        Empresa empresa = buscar();
        System.out.println("Resultado: " + controladorEmpresa.eliminar(empresa.getNombre()));
    }

    public void listar() {
        for (Empresa empresa : controladorEmpresa.getListaEmpresa()) {
            System.out.println(empresa);
        }
    }

    public void cliente() {
        Empresa empresa = buscar();
        if (empresa != null) {
            vistaCliente.getConCli().setListaCliente(empresa.getListadoCliente());
            vistaCliente.menu();
        }
    }

    public void empleado() {
        Empresa empresa = buscar();
        if (empresa != null) {
            vistaEmpleado.getControladorEmpleado().setListaEmpleado(empresa.getListadoEmpleado());
            vistaEmpleado.menu();
        }
    }

    public void directivo() {
        Empresa empresa = buscar();
        if (empresa != null) {
            vistaDirectivo.getConDirec().setListaDirectivo(empresa.getListadoEmDirectivo());
            vistaDirectivo.menu();
        }
    }
 
}
