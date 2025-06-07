import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Olá, seja bem vindo ao Banco Faz me Rir!");

        System.out.print("Digite seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Agência: ");
        agencia = scanner.nextLine();

        System.out.print("Conta Corrente: ");
        numero = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Valor a depositar: ");
        String entrada = scanner.nextLine();
        saldo = Double.parseDouble(entrada.replace(",", "."));

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
