package principal;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorDeInternet;
import interfaces.ReprodutorMusical;
import model.Iphone;

public class TestarIphone {
    public static void main(String[] args) {

        //Intanciamos um novo objeto do tipo Iphone
        Iphone iphone = new Iphone();

        /*Intanciamos novos objetos do tipo AparelhoTelefonico, ReprodutorMusica, NavegadorDeInternet e atribuímos
        a eles o valor do nosso objeto do tipo IPhone. Com isso podemos perceber que o nosso iPhone pode representar
        qualquer uma dos três papéis que definimos dentro de nossa estrutura de objetos*/
        AparelhoTelefonico aparelhoTelefonico = iphone;
        ReprodutorMusical reprodutorMusical = iphone;
        NavegadorDeInternet navegadorDeInternet = iphone;

        //Testando os métodos de um aparelho telefônico no iPhone;
        System.out.println("Testando os métodos de um aparelho telefônico no iPhone:");

        //Saída:"Realizando chamada via iPhone..."
        aparelhoTelefonico.realizarChamada();
        //Saída: "Atendendo chamada via iPhone..."
        aparelhoTelefonico.atenderChamada();
        //Saída: "Iniciando correio de voz via iPhone..."
        aparelhoTelefonico.iniciarCorreioDeVoz();

        System.out.println("---------------------------------------------------------------------");

        //Testando os métodos de um reprodutor musical no iPhone;
        System.out.println("Testando os métodos de um reprodutor musical no iPhone:");

        //Saída:"Tocando música via iPhone..."
        reprodutorMusical.tocar();
        //Saída: "Pausando música via iPhone..."
       reprodutorMusical.pausar();
        //Saída: "Selecionando música via iPhone..."
        reprodutorMusical.selecionarMusica();

        System.out.println("---------------------------------------------------------------------");

        //Testando os métodos de um navegador de internet no iPhone;
        System.out.println("Testando os métodos de navegador de internet no iPhone:");

        //Saída:"Exibindo página da internet via iPhone..."
        navegadorDeInternet.exibirPagina();
        //Saída: "Atualizando página da internet via iPhone..."
        navegadorDeInternet.atualizarPagina();
        //Saída: "Exibindo página da internet via iPhone..."
        navegadorDeInternet.exibirPagina();

        System.out.println("---------------------------------------------------------------------");

    }
}
