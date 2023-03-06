package dio.pacoteisaquemaravilhoso;

public class OrdemInversa {
    public static void main(String[] args) {
        
        int[] vetor = {-5, 0, 15, 50, 8, 5};
        int count = 0;
        System.out.println("vetor: ");
        while (count < vetor.length) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.println("\nVetor: ");
        for (int i = vetor.length-1; i>=0; i--) {
            System.out.print(vetor[i] + " ");
        }

    }
}
