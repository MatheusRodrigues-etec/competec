import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
       Scanner entrada = new Scanner (System.in);
       /*
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
       */
      
      // tabuada * 1
      // tabuada * 2
      // tabuada * 3
      // ...
      // tabuada * 10
      
      int tabuada = entrada.nextInt();
      for (int i = 1; i <= 10; i++) {
          System.out.println( i*tabuada);
      }
      
     
      
      
      
    }
    
}
