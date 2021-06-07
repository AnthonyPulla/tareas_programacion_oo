package validac;
import java.util.Scanner;
public class ValidaC {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int vector[] = new int[11];
        int cd ,r,su = 0;
        int suma=0;
        System.out.println("");
        for(int i = 1;i<vector.length;i++){
            System.out.println("Ingrese el "+i+" valor de la cedula?");
            vector[i] = in.nextInt();
        }   
        System.out.print("Cedula Ingresada: ");
        for(int i =1;i<vector.length;i++){          
            System.out.print(vector[i]);
        }for(int i=1;i<vector.length-1;i++){
            if(i%2==0){
                cd=vector[i]*1;
                vector[i]=cd;
            }else{
                cd=vector[i]*2;
                vector[i]=cd;
                if(cd>9){
                    vector[i]=cd-9; 
                    }
            }
        su+=vector[i];
        suma=su;
        }
        cd=suma/10;
        suma=cd+1;
        cd=suma*10;
        r=cd-su;
        System.out.println("");
        if(r==vector[10]){
        System.out.println("La cedula que ingreso es valida");
        }else{
            System.out.println("La cedula que ingreso es invalida");
        }
    }
}
