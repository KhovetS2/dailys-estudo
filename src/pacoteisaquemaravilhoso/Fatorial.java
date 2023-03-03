package pacoteisaquemaravilhoso;

import java.util.Scanner;

public class Fatorial {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int fatorial;
        
        System.out.println("Fatorial: ");
        numero= scan.nextInt();
        fatorial=numero;
        if (numero == 0) {
            numero=1;
        }
        for (int i = numero; i > 1; --i) {
            numero*=i-1;
        }
        System.out.println("O valor de "+fatorial+" fatorial é "+numero);
    }
    
}
