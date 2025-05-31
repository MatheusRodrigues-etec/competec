/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        

       System.out.println("Os nomes são diferentes?");
       
      
        
       System.out.println("andre" != "matheus");
        
       System.out.println("As idades são iguais?");
       
       System.out.println("idadeAndre" == "idadeMatheus");
       int idadeAndre = 15;
       int idadeMatheus = 16;
       
       
       boolean chovendo = false;
       boolean relampejando = false;
       boolean diaEnsolarado = true;
       
       if (chovendo&&relampejando){
       System.out.println("Melhor nao sair de casa");        
       }
       
       else if (chovendo||relampejando){
       System.out.println("eu ia sair mas perdi meu guarda-chuva");
       }
       
       else if (diaEnsolarado||chovendo){
       System.out.println("Vou sair, o dia esta bonito!");
       }
       
       boolean macarrão = false;
       boolean estrogonofe = false;
       
       if (macarrão&&estrogonofe){
       System.out.println("Vou ficar muito feliz!!!");
       }
        
       else if (macarrão||estrogonofe){
       System.out.println("vou ficar um pouco feliz");
       }
       
       else{
       System.out.println("Nem vou almoçar");
           */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     
     Scanner entrada = new Scanner(System.in);
      /*
      System.out.print("Digite sua idade: ");
      int idade = entrada.nextInt();  
        
      if (idade < 12) { 
          System.out.println("Menor de idade");
      }  else if (idade >= 12 && idade < 18) {   
          System.out.println("Adolescente");
      }  else if (idade >= 18 && idade < 60) {   
          System.out.println("Adulto");
      }  else if (idade >= 60) {   
          System.out.println("Idoso");
      }
        */
        
       System.out.print("Digite o nome do produto: "); 
        String nome = entrada.nextLine();
        
       System.out.print("Digite a categoria (1: comida, 2: eletronicos, 3: vestuário): "); 
        int categoria = entrada.nextInt();
        
       if (categoria == 1) {
            System.out.println("O produto " + nome + " pertence à categoria: Alimentação.");
        } else if (categoria == 2) {
            System.out.println("O produto " + nome + " pertence à categoria: Tecnologia.");
        } else if (categoria == 3) {
            System.out.println("O produto " + nome + " pertence à categoria: Moda.");
        } else {
            System.out.println("Categoria inválida para o produto " + nome + ".");
        }

        entrada.close();
    }
}
       }
       
       
    }
}
