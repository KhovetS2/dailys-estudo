package dio.pacoteisaquemaravilhoso;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numero;
        System.out.print("Tabuada: ");
        numero=scan.nextInt();

        System.out.println("Tabuada: de "+numero);
        for (int i = 1; i < 11; i++) {
            System.out.printf("%d X %d = %d\n", numero, i, numero*i);
        }

    }
}
