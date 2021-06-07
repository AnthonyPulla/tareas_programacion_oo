package practica1;
public class Practica1 {
    public static void main(String[] args) { 
        //Primera Practica
        /**2.Generar una aplicacion que permita determinar el grupo en base a la edad 
        * <2años bbes
        * <12 años Niños 
        * <18 Jovenes 
        * <65 Adultos 
       //*Generear la aplicacion que en base al numero            
       */
        int edad = 14;
        if (edad<2){
            System.out.println("Estas en el grupo de los Bebes.");
        }else if (edad<12){
            System.out.println("Estas en el grupo de los Niños.");
        }else if (edad<18){
            System.out.println("Estas en el grupo de los Jovenes.");
        }else if (edad<65){
            System.out.println("Estas en el grupo de los Adultos.");
        }else{
            System.out.println("Estas en el grupo de los Adultos Mayores.");}
        //Segunda Practica
        /**2.Generar una aplicacion que en base el numero del mes convertir en texto
         * 1_Enero
         * 2_Febrero
         */
       int nm=14;
    switch (nm){
    case 1:System.out.println("El "+nm+" es el mes de Enero");
    break;        
    case 2:System.out.println("El "+nm+" es el mes de Febrero");
    break;
    case 3:System.out.println("El "+nm+" es el mes de Marzo"); 
    break;        
    case 4:System.out.println("El "+nm+" es el mes es Abril");
    break;
    case 5:System.out.println("El "+nm+" es el mes de Mayo");
    break;        
    case 6:System.out.println("El "+nm+" es el mes de Junio");
    break;
    case 7:System.out.println("El "+nm+" es el mes de Julio");
    break;        
    case 8:System.out.println("El "+nm+" es el mes de Agosto");
    break;
    case 9:System.out.println("El "+nm+" es el mes de Septiembre"); 
    break;        
    case 10:System.out.println("El "+nm+" es el mes de Octubre");
    break; 
    case 11:System.out.println("El "+nm+" es el mes de Nomviembre");
    break;        
    case 12:System.out.println("El"+nm+" es el mes de Diciembre");
    break;
    default:if(nm<1 || nm>12){
            System.out.println("El "+nm+" es un mes que no existe");
            }
	}
    }  
}
