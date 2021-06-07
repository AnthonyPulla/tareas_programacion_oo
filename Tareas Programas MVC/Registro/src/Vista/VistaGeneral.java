package Vista;

import Controller.ControladorDNI;
import Controller.ControladorFecha;
import Controller.ControladorPersona;
import Controller.ControladorRegistro;
import java.util.Scanner;
import Model.DNI;
import Model.Fecha;
import Model.Persona;

public class VistaGeneral {

    public Scanner teclado;
    public VistaFecha vistaFecha;
    public ControladorFecha controladorFecha;
    public VistaDNI vistaDNI;
    public ControladorDNI controladorDNI;
    public VistaPersona vistaPersona;
    public ControladorPersona controladorPersona;
    public VistaRegistro vistaRegistro;
    public ControladorRegistro controladorRegistro;
    public VistaGeneral() {
        teclado = new Scanner(System.in);
        controladorFecha = new ControladorFecha();
        controladorDNI = new ControladorDNI();
        controladorPersona = new ControladorPersona();
        controladorRegistro = new ControladorRegistro();
        vistaFecha = new VistaFecha(controladorFecha);
        vistaDNI = new VistaDNI(controladorDNI);
        vistaPersona = new VistaPersona(controladorPersona, controladorFecha, controladorDNI);
        vistaRegistro = new VistaRegistro(controladorRegistro, controladorPersona);
    }

    public void menu() {
        int opcion = 0;
        do {
            System.out.println("Gestión de Registros");
            System.out.println(" 1. Fecha \n 2. DNI \n 3. Persona \n 4. Registro \n 5. Salir");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1: vistaFecha.menu(); break;
                case 2: vistaDNI.menu(); break;
                case 3: this.persona();break;
                case 4: this.registro();break;
            }
        } while (opcion < 5);
    }
    public void persona(){
        Fecha fecha = vistaFecha.buscar();
        DNI dni = vistaDNI.buscar();
        if(fecha != null && dni != null){
            vistaPersona.menu();
        }
    }
    public void registro(){
        Persona persona = vistaPersona.buscar();
        if(persona != null){
            vistaRegistro.menu();
        }
    }    
}
