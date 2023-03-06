package dio.estruturadedados.listaencadeada;

public class No<T> {
    
    private T conteudo;
    private No<T> proximoNo;

    
    public No() {
        this.proximoNo = null;
    }
    
    public No(T conteudo) {
        this.conteudo = conteudo;
        this.proximoNo = null;
    }
    

    public No(T conteudo, No<T> proximoNo) {
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }


    public T getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getProximoNo() {
        return this.proximoNo;
    }

    public void setProximoNo(No<T> proximoNo) {
        this.proximoNo = proximoNo;
    }


    @Override
    public String toString() {
        return "{" +
            " conteudo='" + getConteudo() + "'" +
            "}";
    }

    public String toStringEncadeado() {
        
        String str = "No{"+
         "conteudo= "+ conteudo +
          "}";
        if (proximoNo!=null) {
            str+= "->" + proximoNo.toString();
        } else {
            str +="->null";
        }
        
        return str;
    }


}