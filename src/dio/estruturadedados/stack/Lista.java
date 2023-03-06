package dio.estruturadedados.stack;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        
        
        List<Carro> listaCarros = new ArrayList<>();
        
        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Volkswagen"));
        listaCarros.add(new Carro("Peugeot"));
        
        System.out.println(listaCarros.contains(new Carro("Ford")));
        System.out.println(listaCarros.get(2));
        System.out.println(listaCarros.indexOf(new Carro("Chevrolet")));

        System.out.println(listaCarros.remove(2));
        System.out.println(listaCarros);
        
    }
}
