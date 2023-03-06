package dio.estruturadedados.fila;

public class No<T> {
    
    private T object;
    private No<T> refNo;


    public No() {
    }

    public No(T object) {
        this.object = object;
        this.refNo = null;
    }

    public Object getObject() {
        return this.object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public No<T> getRefNo() {
        return this.refNo;
    }

    public void setRefNo(No<T> refNo) {
        this.refNo = refNo;
    }

    public No<T> object(T object) {
        setObject(object);
        return this;
    }

    public No<T> refNo(No<T> refNo) {
        setRefNo(refNo);
        return this;
    }

    
    @Override
    public String toString() {
        return "{" +
            " object='" + getObject() + "'" +
            "}";
    }
    



}
