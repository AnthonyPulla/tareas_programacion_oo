package vista;
import java.util.Scanner;
import Model.Asignatura;
import Controller.ControlerAsignatura;
public class VistaAsignatura {
    ControlerAsignatura ConAsig;
    Scanner teclado;
    public VistaAsignatura(){
        ConAsig = new ControlerAsignatura();
        teclado = new Scanner(System.in);
    }
    public void menu(){
        int option = 0;
        do{
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
        }while(option<6);
    }
    public void crear(){
        System.out.println("Ingrese el nombre de la Asignatura ");
        String nombre = teclado.next();
        System.out.println("Resultado: " + ConAsig.crear(nombre));    
    }
    public Asignatura buscar(){
        System.out.println("Ingrese el nombre ");
        String nombre = teclado.next();
        Asignatura asignatura = ConAsig.buscar(nombre);
        ConAsig.setSeleccion(asignatura);
        System.out.println(asignatura);
        return asignatura;               
    }
    public void actualizar(){
        Asignatura asignatura = buscar();
        if(asignatura != null){
            System.out.println("Ingrese el nombre");
            String nombre = teclado.next();
            System.out.println("Resultado: " +ConAsig.actualizar(nombre));   
        }
    }
    public void eliminar(){
        Asignatura asignatura = buscar();
        if(asignatura != null)
            System.out.println("Resultado: " + ConAsig.eliminar(asignatura.getNombre()));       
    }
    public void listar(){
        for (Asignatura asignatura: ConAsig.getLisAsig()) 
            System.out.println(asignatura);    
    }

    public ControlerAsignatura getConAsig() {
        return ConAsig;
    }

    public void setConAsig(ControlerAsignatura ConAsig) {
        this.ConAsig = ConAsig;
    }
    
}
