package dio.estruturadedados;

public class No<T> {

    private T conteudo;
    private No<T> proximNo;

    public No(T conteudo) {
        this.conteudo = conteudo;
        this.proximNo= null;
    }

    public T getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximNo() {
        return this.proximNo;
    }

    public void setProximNo(No proximNo) {
        this.proximNo = proximNo;
    }

    public No conteudo(T conteudo) {
        setConteudo(conteudo);
        return this;
    }

    public No proximNo(No proximNo) {
        setProximNo(proximNo);
        return this;
    }


    @Override
    public String toString() {
        return "{" +
            " conteudo='" + getConteudo() + "'" +
            "}";
    }
}
