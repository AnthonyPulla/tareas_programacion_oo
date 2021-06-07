package vista;
import Controller.ControlerAsignatura;
import Controller.ControlerGrupo;
import java.util.Scanner;
import Model.Asignatura;
import Model.Grupo;
public class VistaGrupo {
    private ControlerGrupo ConGru;
    private VistaAsignatura VisAsig;
    private Scanner teclado;    
    public VistaGrupo(VistaAsignatura VisAsig){
    ConGru = new ControlerGrupo();
    this.VisAsig = VisAsig;
    teclado = new Scanner(System.in);
    }
    public void menu(){
        int opccion = 0;
        do{
            System.out.println("");
            System.out.println("1. Crear");
            System.out.println("2. Actualizar");
            System.out.println("3. Buscar");
            System.out.println("4. Eliminar");
            System.out.println("5. Listar");
            System.out.println("6. Gestionar Asignatura");
            System.out.println("7. Salir");
            System.out.print("Elija una opccion: ");
            opccion = teclado.nextInt();
            switch (opccion) {
                case 1:crear(); break;
                case 2:actualizar();break;
                case 3:buscar();break;
                case 4:eliminar();break;
                case 5:listar();break;
                case 6:asignatura();break;

            }        
        }while (opccion>7);
    }
    public void crear(){
        System.out.println("Ingrese nombre de un Aula ");
        String nombre = teclado.next();
        System.out.println("Resultado: " + ConGru.crear(nombre));   
    }
    public Grupo buscar() {
        System.out.println();
        for (Grupo grupo : ConGru.getLisGru()) {
        System.out.println(grupo);
        }
        System.out.print("Seleccione");
        String nombre = teclado.next();
        Grupo grupo = ConGru.buscar(nombre);
        ConGru.setSeleccion(grupo);
        System.out.println(grupo);
        return grupo;
    }
    public void actualizar() {
        Grupo grupo = buscar();
        if(grupo != null){
            System.out.println("Ingrese el nombre");
            String nombre = teclado.next();
            System.out.println("Resultado: " +ConGru.actualizar(nombre));   
        }
    }
    public void eliminar() {
        Grupo grupo = buscar();
        System.out.println("Resultado: " + ConGru.eliminar(grupo.getNombre()));
    }

    public void listar() {
        for (Grupo grupo : ConGru.getLisGru()) {
            System.out.println(grupo);
        }
    }
    public void asignatura(){
        Grupo grupo = buscar();
        if (grupo != null) {
            VisAsig.getConAsig().setLisAsig(grupo.getListaAsignatura());
            VisAsig.menu();
        }   
    }

    public ControlerGrupo getConGru() {
        return ConGru;
    }

    public void setConGru(ControlerGrupo ConGru) {
        this.ConGru = ConGru;
    }
    
}
