package interfaces;

/*Esta interface representa as ações referentes a um AparelhoTelefonico. Uma interface possui apenas
* métodos sem implementação alguma. A interface funciona como um contrato que deverá ser implementada
* por uma outra classe, realizando as ações que deverá conter no método de acordo com a necessidade de cada classe*/
public interface AparelhoTelefonico {

    public void realizarChamada();
    public void atenderChamada();
    public void iniciarCorreioDeVoz();

}
