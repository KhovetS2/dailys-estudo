package dio.pacoteisaquemaravilhoso;

import java.util.Random;

public class NumbAleatorio {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbAleatorio = new int[20];

        for (int i = 0; i < numbAleatorio.length; i++) {
            int numero = random.nextInt(100);
            numbAleatorio[i]= numero;
        }

        System.out.println("Numeros Aleatorios: ");
        for (int numero : numbAleatorio) {
            System.out.print(numero + " ");
        }

        System.out.println("\nSucessores dos Numeros Aleatorios: ");
        for (int numero : numbAleatorio) {
            System.out.print((numero+1) + " ");
        }

        System.out.println("\nAntecessores dos Numeros Aleatorios: ");
        for (int numero : numbAleatorio) {
            System.out.print((numero-1) + " ");
        }
    }
}
