/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.print("Digite o valor da laranja:" );
	    int laranja = entrada.nextInt();
	    
	    System.out.print("Digite o valor da uva:" );
	    int uva = entrada.nextInt();
	    
	    System.out.println("Resultado:" + (laranja + uva));
	    
	    System.out.print("Digite a inicial do seu nome: ");
        char nome = entrada.next().charAt(0);
	   
	    System.out.print("Digite o valor que voce tem no banco: ");
	    double banco = entrada.nextDouble();
	    
	    System.out.print("Digite o valor da sua divida: ");
	    double divida = entrada.nextDouble();
	    
	    System.out.println("Valor que sobrou apos a divida: " + (banco - divida));
	    
	    System.out.print("Digite o valor do produto:");
	    float produto = entrada.nextFloat();
	    
	    System.out.print("Digite a quantidade de parcelas:");
	    float parcelas = entrada.nextFloat();
	    
	    System.out.println("Valor de cada parcela:" + (produto / parcelas));
	    
	    System.out.print("Digite sua data de aniversario:");
	    long aniversario = entrada.nextLong();
	    
	    
	}
}
