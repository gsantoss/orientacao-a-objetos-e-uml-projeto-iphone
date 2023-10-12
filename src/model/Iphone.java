package model;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorDeInternet;
import interfaces.ReprodutorMusical;

/*A classe iPhone irá implementar as interfaces AparelhoTelefonico, ReprodutorMusical, NavegadorDeInternet.
* Com isso temos o polimorfismo o qual fará com que, por meio da implementação dos métódos das interfaces,
* contenha todas as funcionalidades existentes nessas interfaces. Como no Java não existe herança múltipla,
* esta é a forma ideal de atender necessidades desse tipo.
* OBSERVAÇÃO: a anotação  @Override indica que estou sobreescrevendo o método proviente da interface*/
public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorDeInternet {
    @Override
    public void realizarChamada() {
        System.out.println("Realizando chamada via iPhone...");
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo chamada via iPhone...");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz via iPhone...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música via iPhone...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música via iPhone...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música via iPhone...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página da internet via iPhone...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página da internet via iPhone...");
    }

    @Override
    public void exibirNovaAba() {
        System.out.println("Exibindo página nova aba da internet via iPhone...");
    }
}
