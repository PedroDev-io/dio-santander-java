public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void exibirExtrato(){
        System.out.println("----- Extrato Conta Corrente -----");
        super.exibirExtrato();
    }

}
