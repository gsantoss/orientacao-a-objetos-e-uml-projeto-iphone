package interfaces;

/*Esta interface representa as ações referentes a um NavegadorDeInternet. Uma interface possui apenas
 * métodos sem implementação alguma. A interface funciona como um contrato que deverá ser implementada
 * por uma outra classe, realizando as ações que deverá conter no método de acordo com a necessidade de cada classe*/
public interface NavegadorDeInternet {

    public void exibirPagina();
    public void atualizarPagina();
    public void exibirNovaAba();

}
