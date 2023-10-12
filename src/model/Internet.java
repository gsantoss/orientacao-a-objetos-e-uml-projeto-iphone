package model;

import interfaces.NavegadorDeInternet;

/*Essa classe implementa a interface NavegadorDeInternet, sendo assim ela deverá implementar o conteúdo
* que cada método dessa interface possui.
* OBSERVAÇÃO: a anotação  @Override indica que estou sobreescrevendo o método proviente da interface*/
public class Internet implements NavegadorDeInternet {
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página da internet...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página da internet...");
    }

    @Override
    public void exibirNovaAba() {
        System.out.println("Exibindo nova aba da internet");
    }
}
