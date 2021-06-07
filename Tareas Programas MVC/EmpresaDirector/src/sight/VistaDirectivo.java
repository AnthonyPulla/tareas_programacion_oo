package sight;
import Controller.ControladorEmDirectivo;
import java.util.Scanner;
import Model.EmDirectivo;
public class VistaDirectivo {
    public ControladorEmDirectivo ConDirec;
    public EmDirectivo EmDirec;
    public Scanner teclado;

    public VistaDirectivo(){ 
        ConDirec = new ControladorEmDirectivo();
        teclado = new Scanner(System.in);
    }
    public void menu(){
    int position = 0;
    do{
        System.out.println("");
        System.out.println("1. Crear");
        System.out.println("2. Actualizar");
        System.out.println("3. Buscar");
        System.out.println("4. Eliminar");
        System.out.println("5. Listar");
        System.out.println("6. Salir"); 
        System.out.print("Elija una opccion: ");
        position = teclado.nextInt();
        switch(position){
            case 1:crear(); break;
            case 2:actualizar(); break;
            case 3:buscar(); break;
            case 4:eliminar(); break;
            case 5:listar(); break; 
            }
        }while(position==6);
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
        System.out.println("Ingrese el categoria");
        String categoria = teclado.next();
        System.out.println("Resultado: " + ConDirec.crear(nombre, apellido, cedula, direccion, sueldo, categoria));        
        }
        public EmDirectivo buscar(){
        System.out.println("Ingrese la cedula");
        String cedula = teclado.next();
        EmDirectivo directivo = ConDirec.buscar(cedula);
        ConDirec.setSeleccion(directivo);
        System.out.println(directivo);
        return directivo;
        }
    public void actualizar(){
        EmDirectivo directivo = buscar();
        if(directivo != null){
            System.out.println("Ingrese el nombre");
            String nombre = teclado.next();
            System.out.println("Ingrese el apellido");
            String apellido = teclado.next();
            System.out.println("Ingrese el direccion");
            String direccion = teclado.next();
            System.out.println("Ingrese el sueldo");
            double sueldo = teclado.nextDouble();
            System.out.println("Ingrese el categoria");
            String categoria = teclado.next();
            System.out.println("Resultado: " +ConDirec.actualizar(nombre, apellido,directivo.getCedula(), direccion, sueldo,categoria));
        }
    }
    public void eliminar(){
        EmDirectivo directivo = buscar();
        if(directivo != null)
            System.out.println("Resultado: " + ConDirec.eliminar(directivo.getCedula()));
    }
    public void listar(){
        for (EmDirectivo directivo : ConDirec.getListaDirectivo()) 
            System.out.println(directivo);
    }

    public ControladorEmDirectivo getConDirec() {
        return ConDirec;
    }

    public void setConDirec(ControladorEmDirectivo ConDirec) {
        this.ConDirec = ConDirec;
    }
    
}
