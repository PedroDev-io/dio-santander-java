public class TesteIphone {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        //Teste aparelho telefônico
        System.out.println("Aparelho telefônico");
        iphone.ligar("987654321");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        //Teste reprodutor musical
        System.out.println("------------------------");
        System.out.println("Reprodutor musical");
        iphone.selecionarMusica("Welcome to the jungle");
        iphone.tocar();
        iphone.pausar();

        //Teste navegador de internet
        System.out.println("------------------------");
        System.out.println("Navegador de internet");
        iphone.exibirPagina("https://www.google.com");
        iphone.adicionarAba();
        iphone.atualizarPagina();

    }
}