import java.util.Locale;
import java.util.Scanner;
public class exercício5 {

    public static void main (String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int peca1, nPeca1, peca2, nPeca2;
        double  valorUpeca1, valorUPeca2, total;
        peca1 = sc.nextInt();
        nPeca1 = sc.nextInt();
        valorUpeca1 = sc.nextDouble();

        peca2  = sc.nextInt();
        nPeca2 = sc.nextInt();
        valorUPeca2 = sc.nextDouble();

    total = valorUpeca1 * nPeca1 + nPeca2 * valorUPeca2;
        System.out.printf("Valor a Pagar: R$  %.2f%n", total);
        sc.close();
    }
    }
