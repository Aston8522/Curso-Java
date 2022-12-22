package Application;
import entities.funcionario;

import java.util.Scanner;
public class exercicio {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        funcionario func = new funcionario();
        System.out.print("nome do funcionario: ");
        func.nome = sc.nextLine();
        System.out.print("salarioBruto do funcionario:" );
        func.salarioBruto = sc.nextDouble();
        System.out.print("imposto do funcionario: ");
        func.imposto = sc.nextDouble();

        System.out.println();
      System.out.println("funcionario " + func);
        System.out.println();
        System.out.print("porcentagem do aumento? ");
        double porcentagem = sc.nextDouble();
        func.novoSalario(porcentagem);

        System.out.println();
        System.out.println("novo salario: " + func);
        sc.close();

    }
}
