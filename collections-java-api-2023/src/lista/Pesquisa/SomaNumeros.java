package lista.Pesquisa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SomaNumeros {
    //atributos

    List<Integer> numeros;

    //Inicialização da lista
    public SomaNumeros(){
        this.numeros = new ArrayList<>();
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    //Método para adicionar número
    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    //Método para somar os números da lista
    public int calcularSoma(){
        int total = 0;
        if(!numeros.isEmpty()){
            for(Integer numero : numeros){
                total += numero;
            }
            return total;
        }else{
            throw new RuntimeException("A lista está vazia");
        }
    }

    //Método para achar o maior número
    public Integer encontrarMaiorNumero(){
        if(!numeros.isEmpty()){
            return Collections.max(numeros);
        }
        else{
            throw new RuntimeException("A lista está vazia");
        }
    }

    //Método para achar o menor número
    public Integer encontrarMenorNumero(){
        if(!numeros.isEmpty()){
            return Collections.min(numeros);
        }
        else{
            throw new RuntimeException("A lista está vazia");
        }
    }

    //Método para exibir os números
    public void exibirNumeros(){
        if(!numeros.isEmpty()){
            for(int i = 0; i < numeros.size(); i++){
                System.out.println(i+1 + "º número: " + getNumeros().get(i));
            }
        }else{
            System.out.println("A lista está vazia");
        }
    }
}
