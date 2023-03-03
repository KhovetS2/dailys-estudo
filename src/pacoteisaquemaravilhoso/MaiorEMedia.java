package pacoteisaquemaravilhoso;

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numero;
        int contador=0;
        int maior = 0;
        int media = 0;

        do {
            System.out.println("Numero:");
            numero = scan.nextInt();
            contador++;
            media+=numero;
            if (numero>maior) {
                maior=numero;
            }
        } while (contador<5);
        media/=5;
        System.out.printf("Maior: %d \n", maior);
        System.out.printf("Media: %d \n", media);
    }

    
}
