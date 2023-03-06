package dio.estruturadedados.listaduplamenteencadeada;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> minhListaEncadeada = new ListaDuplamenteEncadeada<>();

        minhListaEncadeada.add("c1");
        minhListaEncadeada.add("c2");
        minhListaEncadeada.add("c3");
        minhListaEncadeada.add("c4");
        minhListaEncadeada.add("c5");
        minhListaEncadeada.add("c6");
        minhListaEncadeada.add("c7");

        System.out.println(minhListaEncadeada);
        
        minhListaEncadeada.remove(4);
        
        minhListaEncadeada.add("isaque", 4);
        
        System.out.println(minhListaEncadeada);

        System.out.println(minhListaEncadeada.get(4));
    }
}
