package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavra {
    // Atributo
    private Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavra() {
        this.contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemPalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!contagemPalavrasMap.isEmpty()) {
            contagemPalavrasMap.remove(palavra);
        }
    }

    public void exibirContagemPalavras() {
        if (contagemPalavrasMap.isEmpty()) {
            System.out.println("Nenhuma palavra foi adicionada ainda.");
        } else {
            System.out.println("Contagem de palavras:");
            for (Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int maiorContagem = 0;

        if (!contagemPalavrasMap.isEmpty()) {
            for (Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()) {
                if (entry.getValue() > maiorContagem) {
                    maiorContagem = entry.getValue();
                    palavraMaisFrequente = entry.getKey();
                }
            }
        }
        return palavraMaisFrequente;
    }
}
