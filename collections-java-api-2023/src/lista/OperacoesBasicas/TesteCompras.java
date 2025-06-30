package lista.OperacoesBasicas;

public class TesteCompras {
    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();

        carrinho.adicionarItem("Notebook", 2754.05 , 1);
        carrinho.adicionarItem("Smartphone", 989.89,3);
        carrinho.adicionarItem("TV Smart", 3678.44, 2);
        System.out.println("Carrinho de compras");
        carrinho.exibirItens();

        carrinho.removerItem("Smartphone");
        carrinho.exibirItens();

        System.out.println("Valor total: " + carrinho.calcularValorTotal());
    }
}
