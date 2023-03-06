package dio.estruturadedados.pilha;

public class No {
    private int dado;
    private No refNo;

    public No() {
    }

    public No(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return this.dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getRefNo() {
        return this.refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    public No dado(int dado) {
        setDado(dado);
        return this;
    }

    public No refNo(No refNo) {
        setRefNo(refNo);
        return this;
    }


    @Override
    public String toString() {
        return "{" +
            " dado='" + getDado() + "'" +
            "}";
    }
}
