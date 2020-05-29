package AumentoPreco;

import java.util.Scanner;

public class AumentoPreco {


    public static void main(String[] args) {
       //definicao de variaveis
       double preco, r;
       String nome;

       //entrada
       Scanner entrada = new Scanner (System.in);

       System.out.println("Digite o nome do produto");
       nome = entrada.next();

       System.out.println("Digite o preço do produto");
       preco = entrada.nextDouble();

       //processamento
       r = (preco*1.65);

       //saida
       System.out.println("voce vai vender o produto: "+nome+" por R$ +r");



    }

}
