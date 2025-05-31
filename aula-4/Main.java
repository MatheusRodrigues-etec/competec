import java.util.Scanner;

public class Main {
    public static void main(String[] args) {    
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("insira o tamanho do array: ");
        int num = entrada.nextInt();
        int arranjo[] = new int [num];
        
        for(int i =0; i <arranjo.length; i++){  
            arranjo[i] = entrada.nextInt( );
        }
        
        for(int i =0; i <arranjo.length; i++){  
            System.out.print(arranjo[i] + " ");
        }
        
    }
}
