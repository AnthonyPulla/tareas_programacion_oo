package vista;
import controlador.ClienteControlador;
import controlador.AutoControlador;
import java.util.Scanner;
import modelo.Cliente;
import modelo.Auto;
public class AutoVista {
    private AutoControlador autoControlador;
    private ClienteControlador clienteControlador;
    private Scanner teclado;

    public AutoVista(ClienteControlador clienteControlador) {
        this.clienteControlador = clienteControlador;
        autoControlador = new AutoControlador();
        teclado = new Scanner(System.in);
    }
    public void menu() {
        int opcion = 0;
        do {
            System.out.println("Gestión de Vehiculos");
            System.out.println("1. Crear");
            System.out.println("2. Actualizar");
            System.out.println("3. Buscar");
            System.out.println("4. Eliminar");
            System.out.println("5. Imprimir");
            System.out.println("6. Salir");
            opcion  = teclado.nextInt();
            switch(opcion){
                case 1: this.crear(); break;
                case 2: this.actualizar(); break;
                case 3: this.buscar(); break;
                case 4: this.eliminar(); break;
                case 5: this.imprimir(); break;
            }
        } while (opcion < 6);
    }
    public void crear(){
        System.out.println("Crear - Ingrese los datos:");
        System.out.println("Placa");
        String placa = teclado.next();
        System.out.println("Marca");
        String marca = teclado.next();
        System.out.println("Modelo");
        String modelo = teclado.next();
        boolean resultado = autoControlador.crear(placa, marca, modelo, clienteControlador.getSeleccionado());
        System.out.println("Creado = " + resultado);
    }
    public void actualizar(){
        System.out.println("Actualizar - Ingrese los datos: ");
        System.out.println("Placa");
        String placa = teclado.next();
        System.out.println("Marca");
        String marca = teclado.next();
        System.out.println("Modelo");
        String modelo = teclado.next();
        boolean resultado = autoControlador.actualizar(placa, marca, modelo);
        System.out.println("Actualizado = " + resultado);
    }
    public Auto buscar(){
        System.out.println("Ingresar la placa");
        String placa = teclado.next();
        Auto vehiculo = autoControlador.buscar(placa);
        System.out.println(vehiculo);
        return vehiculo;
    }
    public void eliminar(){
        System.out.println("Ingresar la placa");
        String placa = teclado.next();
        boolean resultado = autoControlador.eliminar(placa);
    }
    public void imprimir(){
        for (Auto vehiculo : autoControlador.getListaAuto()) {
            System.out.println(vehiculo);
        }
    }
    public void asignarSeleccionado(Auto auto){
        autoControlador.setSeleccionado(auto);
    }
    public AutoControlador getAutoControlador() {
        return autoControlador;
    }

    public void setAutoControlador(AutoControlador autoControlador) {
        this.autoControlador = autoControlador;
    }

    public ClienteControlador getClienteControlador() {
        return clienteControlador;
    }

    public void setClienteControlador(ClienteControlador clienteControlador) {
        this.clienteControlador = clienteControlador;
    }
    
}
