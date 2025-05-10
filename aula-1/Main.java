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
       boolean estrogonofe = true;
       
       if (macarrão||estrogonofe){
       System.out.println("Vou ficar muito feliz!!!");
       }
        
        
        
        
       
    }
}
