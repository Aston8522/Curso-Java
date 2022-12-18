import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;

        N = sc.nextInt();
        if (N < 0) {
            System.out.println("negativo");

        }

        else {
            System.out.println("positivo");

        }
        sc.close();
    }
}


