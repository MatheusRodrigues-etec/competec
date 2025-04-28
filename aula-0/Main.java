import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor da laranja e da uva:");
        int laranja = entrada.nextInt();
        int uva = entrada.nextInt();
        System.out.println("Soma dos valores: " + (laranja + uva));

        System.out.print("Inicial do seu nome: ");
        char inicial = entrada.next().charAt(0);

        System.out.println("Informe seu saldo e o valor da dívida:");
        double saldo = entrada.nextDouble();
        double divida = entrada.nextDouble();
        System.out.println("Saldo após dívida: " + (saldo - divida));

        System.out.println("Informe o valor do produto e o número de parcelas:");
        float produto = entrada.nextFloat();
        int parcelas = entrada.nextInt();
        System.out.println("Valor de cada parcela: " + (produto / parcelas));

        System.out.print("Data de aniversário (ex: 20050510): ");
        long aniversario = entrada.nextLong();
    }
}
