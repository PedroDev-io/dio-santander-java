import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem Vindo ao Banco Santander!");
        System.out.println("Informe os dados abaixo para abertura da Conta");
        System.out.println("Por favor, digite o número da agência: ");
        String agencia = sc.nextLine();
        System.out.println("Por favor, insira o número da conta: ");
        int conta = sc.nextInt();
        sc.nextLine();//Consumindo breakpoint
        System.out.println("Por favor, informe o nome do cliente: ");
        String nomeCliente = sc.nextLine();
        System.out.println("Por favor, insira o saldo do cliente: ");
        System.out.print("R$ ");
        double saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta com o nosso banco, sua agência " +
                        "é %s, conta %d e seu saldo de R$%.2f já está disponível para saque\n",
                nomeCliente, agencia, conta, saldo);
        System.out.println("Qualquer dúvida, pode nos contatar através da Central de Atendimento, " +
                "em uma de nossas agências ou entrando em contato com o seu gerente.");
        System.out.println("O Banco Santander agradece a preferência.");

        sc.close();
    }
}