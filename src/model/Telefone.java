package model;

import interfaces.AparelhoTelefonico;

/*Essa classe implementa a interface AparelhoTelefonico, sendo assim ela deverá implementar o conteúdo
 * que cada método dessa interface possui.
 * OBSERVAÇÃO: a anotação  @Override indica que estou sobreescrevendo o método proviente da interface*/
public class Telefone implements AparelhoTelefonico {
    @Override
    public void realizarChamada() {
        System.out.println("Realizando chamada telefônica...");
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo chamada telefônica...");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}
