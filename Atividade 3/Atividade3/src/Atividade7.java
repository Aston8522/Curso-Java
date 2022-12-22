import java.util.Scanner;

public class Atividade7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

   int n = sc.nextInt();
   for (int i=0; i < n; i++){

       int x1 = sc.nextInt();
      int  x2 = sc.nextInt();
       if (x2 == 0) {
           System.out.println("divisão impossivel");
       }
       else{
           double divisao = (double) x1 / x2;

           System.out.printf("%.2f%n" , divisao);
           }


     }
     sc.close();
     }
    }