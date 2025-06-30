package lista.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    //Atributo para armazenar itens

    private List<Item> itens;

    //Construtor que inicializa itens como uma ArrayList
    public CarrinhoCompras() {
        this.itens = new ArrayList<>();
    }

    //Método para adicionar novo item no carrinho
    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itens.add(item);
    }

    //Método para remover um item do carrinho
    public void removerItem(String nome) {
        List<Item> remover = new ArrayList<>();
        if (!itens.isEmpty()) {
            for (Item i : itens) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    remover.add(i);
                }
            }
            itens.removeAll(remover);
        } else {
            System.out.println("A lista está vazia");
        }
    }

    //Método para calcular o total do valor do carrinho
    public double calcularValorTotal() {
        double total = 0.0;
        if (!itens.isEmpty()) {
            for (Item i : itens) {
                total += i.getSubtotal();
            }
            return total;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    //Método para exibir os itens
    public void exibirItens() {
        if (!itens.isEmpty()) {
            System.out.println(itens);
        } else {
            System.out.println("A lista está vazia");
        }
    }
}
