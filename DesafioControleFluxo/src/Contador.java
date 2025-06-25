import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int parametro1 =  terminal.nextInt();
        System.out.print("Digite outro valor: ");
        int parametro2 =  terminal.nextInt();
        try{
            contador(parametro1, parametro2);
        }catch (ParametrosInvalidosException exception){
            System.out.println("Erro: " + exception.getMessage());
        }
        terminal.close();
    }

    static void contador(int parametro1, int parametro2) throws ParametrosInvalidosException{
        if(parametro1 >= parametro2){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        int contagem = parametro2 - parametro1;

        for(int i = 0; i < contagem; i++){
            System.out.println("Imprimindo o número: " + (i+1));
        }
    }
}

