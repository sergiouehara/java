import java.util.Scanner;
public class Areaquad2{

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double lado, area ;
        System.out.println("Digite o valor do lado");
        lado = teclado.nextDouble();  
        area = lado * lado; 
        System.out.println("Valor da area =" + area);
    }
}