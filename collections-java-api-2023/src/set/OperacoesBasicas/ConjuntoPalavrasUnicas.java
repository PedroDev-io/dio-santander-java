package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
//Atributos
    private Set<String> conjuntoSet;

    //construtor
    public ConjuntoPalavrasUnicas(){
        this.conjuntoSet = new HashSet<>();
    }

    //Método get
    public Set<String> getConjuntoSet() {
        return conjuntoSet;
    }

    //Método para adicionarPalavra
    public void adicionarPalavra(String palavra){
        if (palavra == null || palavra.isEmpty()){
            throw new ExcecaoPalavra("Não foi digitada nenhuma palavra");
        }
        conjuntoSet.add(palavra);
    }

    //Método para remover palavra
    public void removerPalavra(String palavra){
        if (conjuntoSet.contains(palavra)) {
            conjuntoSet.remove(palavra);
        }else{
            throw new ExcecaoPalavra("A palavra não existe no conjunto");
        }
    }

    //Método para verificar se a palavra está no conjunto
    public boolean verificarPalavra(String palavra){
        if(!conjuntoSet.contains(palavra)){
           throw new ExcecaoPalavra("A palavra não existe no conjunto");
        }
        return conjuntoSet.contains(palavra);
    }

    //Método para exibir
    public void exibirPalavrasUnicas() {
        if (!conjuntoSet.isEmpty()) {
            System.out.println(conjuntoSet);
        } else {
            throw new ExcecaoPalavra("Conjunto vazio");
        }
    }
}
