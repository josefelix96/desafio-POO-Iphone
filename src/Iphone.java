public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    @Override
    public void ligar() {
        System.out.println("Fazendo Ligação");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina WEB");
    }

    @Override
    public void adicionarPagina() {
        System.out.println("Adicionando pagina WEB");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina WEB");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a musica");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica");
    }
}
