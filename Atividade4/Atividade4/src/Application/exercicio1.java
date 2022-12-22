package Application;
import java.util.Scanner;
import entities.retangulo;


public class exercicio1 {


public static void main (String[]args){
    Scanner sc = new Scanner(System.in);

retangulo retangulo= new retangulo();
    retangulo largura, altura;
    largura = new retangulo();
    altura = new retangulo();

    System.out.println("qual a largura do retangulo: ");
    retangulo.largura = sc.nextDouble();

    System.out.println("qual a altura do retangulo: ");
    retangulo.altura = sc.nextDouble();

    System.out.printf("área %.2f%n" , retangulo.area());
    System.out.printf("perímetro %.2f%n" , retangulo.perimetro());
    System.out.printf("Diagonal %.2f%n" , retangulo.diagonal());







sc.close();
}


}
