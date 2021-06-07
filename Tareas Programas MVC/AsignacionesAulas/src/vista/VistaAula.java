package vista;
import java.util.Scanner;
import Model.Grupo;
import Model.Aula;
import Controller.ControlerAula;
import Controller.ControlerGrupo;
public class VistaAula {
    private ControlerAula ConAula;
    private Scanner teclado;
    private VistaGrupo VisGru;
    public VistaAula(VistaGrupo VisGru){
    ConAula = new ControlerAula();
    this.VisGru = VisGru;
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
            System.out.println("6. Gestionar Grupo");
            System.out.println("7. Salir");
            System.out.print("Elija una opccion: ");
            opccion = teclado.nextInt();
            switch (opccion) {
                case 1:crear(); break;
                case 2:actualizar();break;
                case 3:buscar();break;
                case 4:eliminar();break;
                case 5:listar();break;
                case 6:grupo();break;

            }        
        }while (opccion>7);
    }
    public void crear(){
        System.out.println("Ingrese el Aula");
        String nombre = teclado.next();
        System.out.println("Resultado: " + ConAula.crear(nombre));  
    }
    public Aula buscar() {
        System.out.println();
        for (Aula aula : ConAula.getLisAu()) {
        System.out.println(aula);
        }
        System.out.print("Seleccione ");
        String nombre = teclado.next();
        Aula aula = ConAula.buscar(nombre);
        ConAula.setSeleccion(aula);
        System.out.println(aula);
        return aula;
    }
    public void actualizar() {
        Aula aula = buscar();
        if(aula != null){
            System.out.println("Ingrese el nombre");
            String descripccion = teclado.next();
            System.out.println("Resultado: " +ConAula.actualizar(descripccion));   
        }
    }
    public void eliminar() {
        Aula aula = buscar();
        System.out.println("Resultado: " + ConAula.eliminar(aula.getDescripcion()));
    }

    public void listar() {
        for (Aula aula: ConAula.getLisAu()) {
            System.out.println(aula);
        }
    }
        public void grupo(){
        Aula aula = buscar();
        if (aula != null) {
            VisGru.getConGru().setLisGru(aula.getListGrup());
            VisGru.menu();
        }
    }
}
