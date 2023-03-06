package dio.estruturadedados.listacircular;

public class Main {
    
    public static void main(String[] args) {
        ListaCircular<String> listaCircular = new ListaCircular<>();

        listaCircular.add("c0");
        System.out.println(listaCircular);
        
        listaCircular.remove(0);
        System.out.println(listaCircular);
        
        listaCircular.add("c1");
        System.out.println(listaCircular);
        listaCircular.add("c2");
        listaCircular.add("c3");
        System.out.println(listaCircular);
        for (int i = 0; i < 20; i++) {
            System.out.println(listaCircular.get(i));
            
        }
    }
}
