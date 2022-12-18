import java.util.Scanner;
public class exercicio4 {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        int hI, hF, duracao;
        hI = sc.nextInt();
        hF = sc.nextInt();
        if (hI < hF){
            duracao = hF - hI;

        }
else {
            duracao = 24 - hI + hF;

        }
            System.out.println("O Jogo Durou " + duracao + " horas");

            sc.close();



    }
}
