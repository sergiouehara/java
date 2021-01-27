import java.util.Scanner;
public class Arearet{

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int a ;
        int b ;
        System.out.println("Digite o valor da base");
        a = teclado.nextInt();  
        System.out.println("Digite o valor da altura");
        b = teclado.nextInt();     
     
        System.out.println("Resultado =" + a*b);
    }
}