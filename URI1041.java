import java.util.Scanner;
public class URI1041{

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double cx, cy;
        
        cx = teclado.nextDouble(); 
        cy = teclado.nextDouble(); 
        
        if (cx == 0 && cy == 0){
           System.out.println("Origem"); 
        }
        else if (cx == 0 && cy != 0){
           System.out.println("Eixo Y"); 
        }
        else if (cy == 0 && cx != 0){
           System.out.println("Eixo X"); 
        } 
         else if (cx > 0 && cy > 0){
           System.out.println("Q1"); 
        }  
         else if (cx > 0 && cy < 0){
           System.out.println("Q4"); 
        }  
         else if (cx < 0 && cy > 0){
           System.out.println("Q2"); 
        }  
        else System.out.println("Q3"); 
    }
} 