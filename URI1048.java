import java.util.Scanner;
public class URI1048{

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float salario, novosal, reajuste; 
        int percentual;

        salario = teclado.nextFloat(); 
                
        if (salario >= 0 && salario <= 400){             
           percentual = 15; 
        }
        else if (salario <= 800){
           percentual =  12;
        }
        else if (salario <= 1200){
           percentual = 10;  
        }       
        else if (salario <= 2000){
           percentual = 7;  
        }       
        else percentual = 4;

        reajuste = salario*percentual/100;     
        novosal =  salario + reajuste; 
        System.out.printf("Novo salario: %.2f\n", novosal);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);  
        System.out.println("Em percentual: " +percentual " %" ); 
    }
} 
           
