
package areaperimetroretangulo;

import java.util.Scanner;


public class AreaPerimetroRetangulo {

    
    public static void main(String[] args) {
    //Definição de variaveis
        double  a,p,b,al;
        
        //entrada
        Scanner entrada = new Scanner(System.in);  
        
        System.out.println("Digite a Base: ");
        b = entrada.nextDouble();
        
        System.out.println("Digite a Altura: ");
        al = entrada.nextDouble();
        
        //processamento
        a = b*al;

        p = ((b*2)+(al*2));
        
        //saida
        System.out.println("A area do retangulo é: "+a);
        System.out.println("O perimetro do retangulo é: "+p);
                
    }
    
}
