package pacoteisaquemaravilhoso;

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int totalConsoantes=0;
        int count = 0;

        do {
            System.out.println("Letra: ");
            String letra = scan.next();
            

            if (!(letra.equals("a") | letra.equals("e") | letra.equals("i") | letra.equals("o") | letra.equals("u"))) {
                consoantes[count]=letra;
                totalConsoantes++;
            }
            count++;
        } while (count< consoantes.length);

        for (String consoante : consoantes) {
            if(consoante != null)
                System.out.print(consoante + " ");
        }
        System.out.println("\nTotal de consoantes: "+totalConsoantes);
    }
}
