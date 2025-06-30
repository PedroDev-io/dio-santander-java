package lista.Ordenacao;

public class TesteNumeros {
    public static void main(String[] args) {
        OrdenacaoNumeros ordem = new OrdenacaoNumeros();
        ordem.adicionarNumero(4);
        ordem.adicionarNumero(1);
        ordem.adicionarNumero(2);
        System.out.println("Ascendente: " + ordem.ordenarAscendente());
        System.out.println("Descendente: " + ordem.ordenarDescendente());


    }
}
