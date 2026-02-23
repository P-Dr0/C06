import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int npa;
        int np3;

        System.out.print("Insira sua NPA: ");
        npa = entrada.nextInt();

        if (npa >= 60 && npa <= 100) {
            System.out.println("Aprovado");
        }
        else {
            System.out.print("Insira sua NP3: ");
            np3 = entrada.nextInt();

            if ((np3 + npa) / 2 <= 50) {
                System.out.println("Aprovado");
            }
            else {
                System.out.println("Reprovado");
            }
        }

        entrada.close();
    }
}
