import java.util.Scanner;
public class URI1014{

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int DISTANCIA ;
        double CONSUMO, MEDIA;
        CODP1 = teclado.nextInt();  
        QTDEP1 = teclado.nextInt();
        VALP1 = teclado.nextDouble();  
        CODP2 = teclado.nextInt();  
        QTDEP2 = teclado.nextInt();
        VALP2 = teclado.nextDouble();      

        TOTAL = QTDEP1*VALP1 + QTDEP2*VALP2 ;
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", TOTAL);
    }
} 