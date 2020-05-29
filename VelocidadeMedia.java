
package listadeexercicios;

import java.util.Scanner;


public class VelocidadeMedia {

   
    public static void main(String[] args) {
       double per, hora, min, tempo, velomedia;
       
       Scanner entrada = new Scanner (System.in);
       
       System.out.println("Digite o percurso");
       per =entrada.nextDouble();
       System.out.println("Digite a hora sem os minutos");
       hora =entrada.nextDouble();
       System.out.println("Digite oos minutos");
       min =entrada.nextDouble();
        
       tempo = (min/60)+hora;
       
       velomedia = per/tempo;
       
       System.out.println("A velocidade do carro era de "+ velomedia+"km/h");
        
    }
    
}
