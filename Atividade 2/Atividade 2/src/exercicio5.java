import java.util.Scanner;
public class exercicio5 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int codigoI, quantidade;
        double total;
        codigoI = sc.nextInt();
        quantidade = sc.nextInt();

            if (codigoI == 1) {
                total = quantidade * 4.0;
            }
            else if (codigoI == 2) {
                total = quantidade * 4.5;
            }
            else if (codigoI == 3) {
                total = quantidade * 5.0;
            }
            else if (codigoI == 4) {
                total = quantidade * 2.0;
            }
            else {
                total = quantidade * 1.5;
            }
            System.out.printf("Total: R$ %.2f%n", total);
            sc.close();
    }
}









