import java.util.Scanner;
public class URI1020{

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int A, B ;
        double C, SALARY ;
        A = teclado.nextInt();  
        B = teclado.nextInt();  
        C = teclado.nextDouble();
        SALARY = A*B; 
        System.out.println("NUMBER = "+A);
        System.out.printf("SALARY = U$ %.2f\n", SALARY);
    }
} 