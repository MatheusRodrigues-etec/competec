/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
       Scanner entrada = new Scanner (System.in);
       
       int y = 0;
       String nome = entrada.nextLine();
       
       while(y < 5) {
            System.out.println(nome);
            y++;
       }
       
       
       
       
       int x = 1;
       int soma = 0;
       while (x <= 100) {
           soma += x;
           x++;
       }
       
       System.out.println("Valor total:" +soma);
       
      
      // tabuada * 1
      // tabuada * 2
      // tabuada * 3
      // ...
      // tabuada * 10
      
      int tabuada = entrada.nextInt();
      for (int i = 1; i <= 10; i++) {
          System.out.println( i*tabuada);
      }
      
          import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     
     Scanner entrada = new Scanner(System.in);
      
      for (int pares = 2; pares <= 20; pares += 2) {    
          System.out.println("Os pares são: " + pares);
      }
      
      
      int n = 10;
      
      while (n > 0) {   
          System.out.println("Descendo...: " + n);
          n--;
      }
          System.out.println("Numeros Esgotados.");
      
      
      
    }
}
     
      
      
      
    }
    
}
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     
     Scanner entrada = new Scanner(System.in);
      /*
      for (int pares = 2; pares <= 20; pares += 2) {    
          System.out.println("Os pares são: " + pares);
      }
      
      
      int n = 10;
      
      while (n > 0) {   
          System.out.println("Descendo...: " + n);
          n--;
      }
          System.out.println("Numeros Esgotados.");
      */
          System.out.print("Digite um Numero: ");
      int acesso = entrada.nextInt();
      int contador = 0;    
      
      
       while (acesso != 0) {    
           contador++;
           System.out.print("Digite outro Numero: ");
           acesso = entrada.nextInt();
           
       }
      
      System.out.println("Você digitou " + contador + " Numeros diferentes de zero.");
      entrada.close();
      
    }
}
