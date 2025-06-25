public class TesteIphone {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        //Testando aparelho telefônico
        System.out.println("Aparelho telefônico");
        iphone.ligar("98743216");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        //Testando reprodutor musical
        System.out.println("-----------------------");
        System.out.println("Reprodutor musical");
        iphone.selecionarMusica("Welcome to the jungle");
        iphone.tocar();
        iphone.pausar();

        //Testando navegador de internet
        System.out.println("-----------------------");
        System.out.println("Navegador de internet");
        iphone.exibirPagina("https://www.google.com");
        iphone.adicionarAba();
        iphone.atualizarPagina();

    }
}