package set.Pesquisa;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

public class ListaTarefas {
    //atributos

    private Set<Tarefa> listaTarefaSet;

    public ListaTarefas() {
        this.listaTarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa remover = null;
        if(!listaTarefaSet.isEmpty()){
            for(Tarefa tarefa : listaTarefaSet){
                if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                    remover = tarefa;
                    break;
                }
            }
            listaTarefaSet.remove(remover);
        }else{
            throw new NoSuchElementException("Não possui essa atividade na lista");
        }
    }

    public void exibirTarefas(){
        System.out.println(listaTarefaSet);
    }

    public int contarTarefas(){
        return listaTarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefaConcluida = new HashSet<>();
        for(Tarefa tarefa : listaTarefaSet){
            if(tarefa.isSituacao()){
                tarefaConcluida.add(tarefa);
            }
        }
        return tarefaConcluida;
    }

    public Set<Tarefa> obterTarefasPendente(){
        Set<Tarefa> tarefaPendente = new HashSet<>();
        for(Tarefa tarefa : listaTarefaSet){
            if(!tarefa.isSituacao()){
                tarefaPendente.add(tarefa);
            }
        }
        return tarefaPendente;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : listaTarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setSituacao(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaParaMarcarComoPendente = null;
        for (Tarefa t : listaTarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaMarcarComoPendente = t;
                break;
            }
        }
        if (tarefaParaMarcarComoPendente != null) {
            if(tarefaParaMarcarComoPendente.isSituacao()) {
                tarefaParaMarcarComoPendente.setSituacao(false);
            }
        } else {
            System.out.println("Tarefa não encontrada na lista.");
        }
    }

    public void limparListaTarefas() {
              listaTarefaSet.clear();
    }
}
