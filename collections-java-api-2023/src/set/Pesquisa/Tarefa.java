package set.Pesquisa;

import java.util.Objects;

public class Tarefa {
    //atributo

    private String descricao;
    private boolean situacao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", situacao=" + situacao +
                '}';
    }
}
