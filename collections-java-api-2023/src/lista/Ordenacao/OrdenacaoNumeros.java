package lista.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    //Atributos
    private List<Integer> numeros;

    //Inicialização da lista
    public OrdenacaoNumeros(){
        this.numeros = new ArrayList<>();
    }

    //Método para adicionar número
    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    //Método para ordenar do menor para o maior
    public List<Integer> ordenarAscendente() {
        List<Integer> listaAscendente = new ArrayList<>(this.numeros);
        Collections.sort(listaAscendente);
        return listaAscendente;
    }

    //Método para ordenar do maior para o menor
    public List<Integer> ordenarDescendente() {
        List<Integer> listaDescendente = new ArrayList<>(this.numeros);
        listaDescendente.sort(Collections.reverseOrder());
        return listaDescendente;
    }
}
