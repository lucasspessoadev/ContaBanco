import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        System.out.print("Agência: ");
        String agencia = scanner.next();
        System.out.print("Número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nome do Cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Saldo Inicial: ");
        double saldo = scanner.nextDouble();
        scanner.close();
        String mensagemFinal = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        System.out.println(mensagemFinal);
    }
}