public class Principal {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("Navegador internet");
        iphone.adicionarPagina();
        iphone.exibirPagina();
        iphone.atualizarPagina();
        System.out.println("***************************");

        System.out.println("Aparelho telefonico");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        System.out.println("***************************");

        System.out.println("Reprodutor musical");
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();
        System.out.println("***************************");
    }
}
