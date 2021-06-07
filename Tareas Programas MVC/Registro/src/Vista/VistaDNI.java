package Vista;

import Controller.ControladorDNI;
import java.util.Scanner;
import Model.DNI;

public class VistaDNI {
    public Scanner teclado;
    private ControladorDNI controladorDNI;
    public VistaDNI(ControladorDNI controladorDNI){
        teclado = new Scanner(System.in);
        this.controladorDNI = controladorDNI;
    }
    public void menu(){
        int opcion = 0;
        do {            
            System.out.println(" 1. Crear \n 2. Actualizar \n 3. Buscar \n 4. Eliminar \n 5. Listar \n 6. Salir");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1: this.crear(); break;
                case 2: this.actualizar(); break;
                case 3: this.buscar(); break;
                case 4: this.eliminar(); break;
                case 5: this.listar(); break;
            }
        } while (opcion < 6);
    }
    public void crear(){
        System.out.println("Ingrese: \n numero");
        String numero = teclado.next();
        System.out.println("Codigo Verificacio");
        int codigoVerificacion = teclado.nextInt();
        System.out.println("Res:" + controladorDNI.crear(numero, codigoVerificacion));
    }
    public void actualizar(){
        System.out.println("Ingrese: \n numero");
        String numero = teclado.next();
        System.out.println("Codigo Verificacio");
        int codigoVerificacion = teclado.nextInt();
        System.out.println("Res:" + controladorDNI.actualizar(numero, codigoVerificacion));
    }
    public DNI buscar(){
        System.out.println("Ingrese: \n numero");
        String numero = teclado.next();
        System.out.println(controladorDNI.buscar(numero));
        return controladorDNI.buscar(numero);
    }
    public void eliminar(){
        this.buscar();
        System.out.println("Res: "+ controladorDNI.eliminar(controladorDNI.getSeleccionado().getNumero()));
    }
    public void listar(){
        for (DNI dni : controladorDNI.getListaDNI()) {
            System.out.println(dni);
        }
    }    
}
