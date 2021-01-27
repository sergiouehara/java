import java.util.Scanner;
public class Areaquad{

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int a ;
        System.out.println("Digite um numero");
        a = teclado.nextInt();  
        
        System.out.println("Resultado =" + a*a);
    }
}