import java.util.Scanner;
public class URI1048{

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double salario, novosal, reajuste, percentual ; 
        
        salario = teclado.nextDouble(); 
                
        if (salario >= 0 && salario <= 400){
           novosal = salario * 1.15;   
           reajuste = salario * 0.15; 
           System.out.println("Novo salario =" + novosal);
           System.out.println("Reajuste = %.2f\n", reajuste);  
           System.out.println("Em percentual = 15%"); 
        }
        else if (salario > 400){
           System.out.println("Eixo Y"); 
        }
        else if (salario > 800){
           System.out.println("Eixo X"); 
        }        
        else System.out.println("Q3"); 
    }
} 