package ejerciciosbucles;
public class EjerciciosBucles {
    public static void main(String[] args) {
        //Seire del fibonacci
        int a=0,c= 0;
        int b=1;
        for (int con= 0;con<=10;con++){
            System.out.print(a+",");
            c=a+b;
            b=a;
            a=c;
        }
    }
    
}
