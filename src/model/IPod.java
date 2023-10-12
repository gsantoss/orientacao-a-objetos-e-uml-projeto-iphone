package model;

import interfaces.ReprodutorMusical;

/*Essa classe implementa a interface ReprodutorMusical, sendo assim ela deverá implementar o conteúdo
 * que cada método dessa interface possui.
 * OBSERVAÇÃO: a anotação  @Override indica que estou sobreescrevendo o método proviente da interface*/
public class IPod implements ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }
}
