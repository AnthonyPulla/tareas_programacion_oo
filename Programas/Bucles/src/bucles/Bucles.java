package bucles;
public class Bucles {
    public static void main(String[] args) {

        System.out.println("Tabla de multiplicar hecho con While"); 
        int c = 12;
        int n = 4,r=0;
        while(c>=1){
            r = n*c;
            System.out.println(n+"*"+c+"="+r);
            c-=1;
            }
        
        System.out.println("");
        System.out.println("Tabla de Multiplicar hecho con Do-while");
        int c2=12, result=0;
        do{
            result= n*c2;
            System.out.println(n+"*"+c2+"="+result);
            c2-=1;
            }while(c2>=1);
        
        System.out.println("");
        System.out.println("Tabla de multiplicar hecho con For");
        int re=0;
        for(int e=12;e>=1;e--){
            re = n*e;
            System.out.println(n+"*"+e+"="+re);
            }
       }
}
