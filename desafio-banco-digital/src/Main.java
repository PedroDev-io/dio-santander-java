public class Main {
    public static void main(String[] args) {
        Cliente pedro = new Cliente();

        pedro.setNome("Pedro");

        ContaCorrente cc = new ContaCorrente(pedro);
        ContaPoupanca cp = new ContaPoupanca(pedro);

        cc.depositar(100);
        cc.transferir(100, cp);

        cc.exibirExtrato();
        cp.exibirExtrato();


    }
}