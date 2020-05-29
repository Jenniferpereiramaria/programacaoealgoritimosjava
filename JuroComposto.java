package jurocomposto;

import java.util.Scanner;

public class JuroComposto {

    public static void main(String[] args) {
       double emp,taxa,r;
       int temp;
       Scanner entrada = new Scanner (System.in);
       
       System.out.println("Quanto quer pegar imprestado?");
       emp = entrada.nextDouble();
       System.out.println("Em quantos meses vai pagar?");
       temp = entrada.nextInt();
       
       taxa = 0.02;
      
       r = emp*(Math.pow((1+taxa),temp));
       
       System.out.println("Ao final de"+ temp+ " meses, voce pagara: R$"+ r +"reais" );
        
         
        
    }
    
}
