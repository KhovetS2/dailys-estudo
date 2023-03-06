package dio.pacoteisaquemaravilhoso;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int qntNumeros;

        int par=0;
        int impar=0;
        int contador=0;
        
        int numero;

        System.out.println("Quantidade de números: ");
        qntNumeros = scan.nextInt();
        
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) {
                par++;
            } else {
                impar++;
            }
            contador++;
        } while (contador < qntNumeros);
        System.out.printf("Quantidade de numeros Par: %d\n", par);
        System.out.printf("Quantidade de numeros Impar: %d\n", impar);
    }
}
