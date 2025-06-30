package lista.Pesquisa;

public class TesteSomaNumeros {
    public static void main(String[] args) {
        SomaNumeros soma = new SomaNumeros();
        soma.adicionarNumero(4);
        soma.adicionarNumero(3);
        soma.adicionarNumero(7);
        soma.exibirNumeros();

        System.out.println("Maior número: " + soma.encontrarMaiorNumero());
        System.out.println("Menor número: " + soma.encontrarMenorNumero());

        System.out.println("Total:" + soma.calcularSoma());
    }
}
