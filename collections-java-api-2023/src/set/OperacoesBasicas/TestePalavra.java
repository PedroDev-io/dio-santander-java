package set.OperacoesBasicas;

public class TestePalavra {
    public static void main(String[] args) {
        //Instanciando
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

        System.out.println("--------------------------");
        System.out.println("Exibindo palavras");
        try{
            conjunto.exibirPalavrasUnicas();
        }catch (ExcecaoPalavra e){
            System.out.println("Erro: "+e.getMessage());
        }

        System.out.println("-------------------------");
        System.out.println("Adicionando Palavras:");
       try{
           conjunto.adicionarPalavra("Papagaio");
           System.out.println("Palavra(s):" + conjunto.getConjuntoSet());
           conjunto.adicionarPalavra("Edificio");
           System.out.println("Palavra(s):" + conjunto.getConjuntoSet());
           conjunto.adicionarPalavra("Sorriso");
           System.out.println("Palavra(s):" + conjunto.getConjuntoSet());
           conjunto.adicionarPalavra("");
           System.out.println("Palavra(s):" + conjunto.getConjuntoSet());
       }catch(ExcecaoPalavra e){
           System.out.println("Erro: "+e.getMessage());
       }

        System.out.println("--------------------------");
        System.out.println("Exibindo palavras");
        try{
            conjunto.exibirPalavrasUnicas();
        }catch (ExcecaoPalavra e){
            System.out.println("Erro: "+e.getMessage());
        }

        System.out.println("--------------------------");
        System.out.println("Verificando palavra");
        try{
            conjunto.verificarPalavra("Papagaio");
            conjunto.verificarPalavra("Espelho");
        }catch (ExcecaoPalavra e){
            System.out.println("Erro: "+e.getMessage());
        }

        //Removendo palavra
        System.out.println("--------------------------");
        System.out.println("Removendo palavra");
        try{
            conjunto.removerPalavra("Edificio");
        }catch(ExcecaoPalavra e){
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("--------------------------");
        System.out.println("Exibindo conjunto");
        conjunto.exibirPalavrasUnicas();
    }
}
