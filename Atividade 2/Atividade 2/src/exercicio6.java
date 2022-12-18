import java.util.Scanner;
public class exercicio6 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        double numero;
                numero = sc.nextDouble();
                if (numero < 0 || numero > 100) {
    System.out.println("Fora de intervalo");
        }
                else if (numero <= 25){
                    System.out.println("intervalo [0,25]");

                }
                else if (numero <= 50) {
                    System.out.println("intervalo [23,50]");
                }
                else if (numero <= 75) {
                    System.out.println("intervalo [50,75]");
                }
                else
                    System.out.println("intervalo [75,100]");
                sc.close();





                }

}
