package dio.estruturadedados.listacircular;

public class ListaCircular<T> {
    
    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;


    public ListaCircular() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanhoLista = 0;
    }

    public int size() {
        return this.tamanhoLista;
    }

    public boolean isEmpty() {
        return this.tamanhoLista ==0? true : false;
    }


    private No<T> getNo(int index){
        if (this.isEmpty()) 
            throw new IndexOutOfBoundsException("A lista está vazia!");

        if (index==0) {
            return this.cauda;
        }
        No<T> noAuxiliar = this.cauda;
        for (int i = 0; (i < index) && (noAuxiliar!=null); i++) {
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        return noAuxiliar;
    }

    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    public void remove(int index) {
        if (index>= this.tamanhoLista)
            throw new IndexOutOfBoundsException("O indice é maior que o tamanho da lista");
        
        No<T> noAuxiliar = this.cauda;
        if (index == 0) {
            this.cauda = this.cauda.getNoProximo();
            this.cabeca.setNoProximo(this.cauda);
        }else if (index == 1) {
            this.cauda.setNoProximo(this.cauda.getNoProximo());
        }else{
            for (int i = 0; i < index-1; i++) {
                noAuxiliar=noAuxiliar.getNoProximo();
            }
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
        }
        this.tamanhoLista--;
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);
        if (this.tamanhoLista==0) {
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cauda.setNoProximo(cauda);
        }else{
            novoNo.setNoProximo(this.cauda);
            this.cabeca.setNoProximo(novoNo);
            this.cauda = novoNo;
        }

        this.tamanhoLista++;
    }



    @Override
    public String toString() {
        String stringRetorno ="";

        No<T> noAuxiliar = this.cauda;
        for (int i = 0; i < this.size(); i++) {
            stringRetorno +="[No{conteudo= " + noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        stringRetorno+= this.isEmpty()? "[]" :"(Retorna ao inicio)";


        
        return stringRetorno;
    }


}
