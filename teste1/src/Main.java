import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int x;
        int y;
        int result = 1;

        Scanner input = new Scanner(System.in);

        x = input.nextInt();
        y = input.nextInt();

        for (int i = 1; i <= y; i++) {
            result *= x;
        }

        System.out.println(result);

    }
}
