package dio.estruturadedados.fila;

public class Fila<T> {
    
    private No<T> refNoEntradaFilaNo;

    
    public Fila() {
    }

    public Fila(No<T> refNoEntradaFilaNo) {
        this.refNoEntradaFilaNo = refNoEntradaFilaNo;
    }

    public boolean isEmpty(){
        return refNoEntradaFilaNo == null? true : false;
    }

    
    public No<T> getRefNoEntradaFilaNo() {
        return this.refNoEntradaFilaNo;
    }

    public void setRefNoEntradaFilaNo(No<T> refNoEntradaFilaNo) {
        this.refNoEntradaFilaNo = refNoEntradaFilaNo;
    }
    
    public Fila<T> refNoEntradaFilaNo(No<T> refNoEntradaFilaNo) {
        setRefNoEntradaFilaNo(refNoEntradaFilaNo);
        return this;
    }

    public void enqueue(T obj) {
        No<T> novoNo= new No<>(obj);
        novoNo.setRefNo(refNoEntradaFilaNo);
        refNoEntradaFilaNo= novoNo;
    }

    public T first() {
        if (!this.isEmpty()) {
            No<T> primeiroNo = refNoEntradaFilaNo;
            while (true) {
                if (primeiroNo.getRefNo()!=null) {
                    primeiroNo=primeiroNo.getRefNo();
                } else {
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        } else {
            return null;
        }
        
    }

    public T dequeue() {
        if (!this.isEmpty()) {
            No<T> primeiroNo = refNoEntradaFilaNo;
            No<T> noAuxiliar = refNoEntradaFilaNo;
            while (true) {
                if (primeiroNo.getRefNo()!=null) {
                    noAuxiliar= primeiroNo;
                    primeiroNo=primeiroNo.getRefNo();
                } else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        } else {
            return null;
        }
        
    }

    
    @Override
    public String toString() {
        String stringRetorno = "";
        
        No<T> noAuxiliar = refNoEntradaFilaNo;

        if (refNoEntradaFilaNo!=null) {
            while (true) {
                stringRetorno+= "[No{objeto="+ noAuxiliar.getObject()+ "}]--->";
                if (noAuxiliar.getRefNo()!=null) {
                    noAuxiliar = noAuxiliar.getRefNo();
                }
                else{
                    stringRetorno+="null";
                    break;
                }
            }
        } else {
            stringRetorno="null";
        }

        return stringRetorno;
    }
    
}