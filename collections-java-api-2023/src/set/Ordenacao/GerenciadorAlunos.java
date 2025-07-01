package set.Ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, int matricula, double media) {
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(int matricula) {
        Aluno remover = null;
        if (!alunoSet.isEmpty()) {
            for (Aluno aluno : alunoSet) {
                if (aluno.getMatricula() == matricula) {
                    remover = aluno;
                    break;
                }
            }
            if (remover != null) {
                alunoSet.remove(remover);
            } else {
                throw new NoSuchElementException("Matrícula não encontrada");
            }
        } else {
            throw new NoSuchElementException("O conjunto de alunos está vazio");
        }
    }

    public Set<Aluno> exibirAlunosPorNome() {
        return new TreeSet<>(alunoSet); // Uses Aluno.compareTo()
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorNotas());
        alunoPorNota.addAll(alunoSet); // ✅ Correct order
        return alunoPorNota;
    }

    public void exibirAlunos() {
        System.out.println(alunoSet);
    }
}

class ComparatorNotas implements Comparator<Aluno> {
    @Override
    public int compare(Aluno o1, Aluno o2) {
        return Double.compare(o1.getMedia(), o2.getMedia());
    }
}