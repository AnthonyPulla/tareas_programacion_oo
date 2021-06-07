package javaapplication8;
import java.util.Scanner;
public class JavaApplication8 {
    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
       //Primera Practica....
       String nombre = "",nombre_2="";
       System.out.println("Escriba el primero nombre ");
       nombre =  in.nextLine();
       System.out.println("Esriba el segundo nombre ");
       nombre_2 = in.nextLine();
       if(nombre.equals(nombre_2)){
           System.out.println("Los nombre son iguales.");
       }else{
           System.out.println("Los nombre no son iguales."); 
       }
       //Segunda Practica....
       int password = 12345;
       int contraseña = 0;
       String usuario = "";
       System.out.println("Inicio de sesion");
       System.out.println("Ingrese el usuario.");
       usuario = in.nextLine();
       System.out.println("Ingrese la contraseña");
       contraseña = in.nextInt();
       if(usuario.equals("Anthony")&&contraseña==password){
           System.out.println("Inicio de sesion correctos.");
       }else{
           System.out.println("Nombre de usuario o password incorrectos.");
       }
    }
}
