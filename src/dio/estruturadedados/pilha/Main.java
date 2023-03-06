package dio.estruturadedados.pilha;

public class Main {
    public static void main(String[] args) {
        Pilha minhPilha = new Pilha();

        minhPilha.push(new No(1));
        minhPilha.push(new No(2));
        minhPilha.push(new No(3));
        minhPilha.push(new No(4));
        minhPilha.push(new No(5));
        
        System.out.println(minhPilha);
        minhPilha.pop();
        System.out.println(minhPilha);
        minhPilha.push(new No(9));
        System.out.println(minhPilha);
    }
}
