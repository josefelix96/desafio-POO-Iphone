
## POO - Desafio

Modelagem e diagramação da representação em UML e Código no que se refere ao componente iPhone.

Com base no vídeo de lançamento do iPhone conforme link abaixo, elaborei em uma ferramenta de UML a diagramação das classes e interfaces com a proposta de representar os papéis do iPhone de: Reprodutor Musicial,  Aparelho Telefônico e Navegador na Internet. Em seguida criei as classes e interfaces no formato de arquivos .java

[Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)

- Minutos relevantes do 00:15 até 00:55

###### Comportamentos esperados:
* Repodutor Musicial: tocar, pausar, selecionarMusica
* Aparelho Telefônico: ligar, atender, iniciarCorrerioVoz
* Navegador na Internet: exibirPagina, adicionarNovaAba, atualizarPagina

## Diagrama
!["Diagrama UML do iPhone"](img/Diagrama.png)

## Codigo Interfaces
```
public interface ReprodutorMusical {
    public void tocar();
    public void pausar();
    public void selecionarMusica();
}

public interface NavegadorInternet {
    public void exibirPagina();
    public void adicionarPagina();
    public void atualizarPagina();
}

public interface AparelhoTelefonico {
    public void ligar();
    public void atender();
    public void iniciarCorreioVoz();
}
```
## Class Iphone
###### Implementação das interfaces e sobreescrevendo os metodos.
```
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
```
## Class Principal 
###### Criação do objeto iphone e chamando os metodos.
```
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
```
## Teste da aplicação
!["teste aplicação"](img/teste.png)
