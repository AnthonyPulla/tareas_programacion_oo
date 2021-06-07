package vista;
import Controller.ControlerAsignatura;
import Controller.ControlerGrupo;
import Controller.ControlerAula;
import java.util.Scanner;
public class VistaGeneral {
    private Scanner teclado;
    private VistaAsignatura VisAsig;
    private VistaGrupo VisGru;
    private VistaAula VisAul;
    public VistaGeneral(){
        VisAsig = new VistaAsignatura();
        VisGru = new VistaGrupo(VisAsig);
        VisAul = new VistaAula(VisGru);
        teclado = new Scanner(System.in);
    }
    public void menu(){
    int position = 0;
    do{
    System.out.println("1.Aula");
    System.out.println("2.Salir");
    System.out.print("Eliga una opccion ");
    position = teclado.nextInt();
    switch(position){
        case 1: VisAul.menu();break;
    }
        }while (position<2);
    }
}

