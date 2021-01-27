import java.util.Scanner;
public class URI1020{

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int I, A, M, R, D;
        
        I = teclado.nextInt();  
        
        A=I/365; 
        R=I%365;
        M=R/30; 
        D=R%30; 

        System.out.println("ANOS = "+A);
        System.out.println("MESES = "+M);
        System.out.println("DIAS = "+D);
    }
} 