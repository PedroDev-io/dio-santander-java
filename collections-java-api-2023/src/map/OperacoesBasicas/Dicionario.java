package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    // Atributo
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras() {
        if (dicionarioMap.isEmpty()) {
            System.out.println("O dicionário está vazio.");
        } else {
            System.out.println("Palavras no dicionário:");
            for (Map.Entry<String, String> entry : dicionarioMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
    public String pesquisarPorPalavra(String palavra) {
        String definicao = null;
        if (!dicionarioMap.isEmpty()) {
            definicao = dicionarioMap.get(palavra);
        }
        return definicao;
    }
}