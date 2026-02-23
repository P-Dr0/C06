import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int lanche1;
        int lanche2;
        int lanche3;

        System.out.print("Digite o número de lanches consumidos na primeira hora: ");
        lanche1 = entrada.nextInt();
        System.out.print("Digite o número de lanches consumidos na segunda hora: ");
        lanche2 = entrada.nextInt();
        System.out.print("Digite o número de lanches consumidos na terceira hora: ");
        lanche3 = entrada.nextInt();

        int total = lanche1 + lanche2 + lanche3;
        int media = total / 3;

        System.out.println("Total de lanches: " + total);
        System.out.println("Media de lanches: " + media);

        entrada.close();

    }
}
