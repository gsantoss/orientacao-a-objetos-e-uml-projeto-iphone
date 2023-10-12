package interfaces;

/*Esta interface representa as ações referentes a um ReprodutorMusical. Uma interface possui apenas
 * métodos sem implementação alguma. A interface funciona como um contrato que deverá ser implementada
 * por uma outra classe, realizando as ações que deverá conter no método de acordo com a necessidade de cada classe*/
public interface ReprodutorMusical {

    public void tocar();
    public void pausar();
    public void selecionarMusica();

}
