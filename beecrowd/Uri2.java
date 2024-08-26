
import java.util.Scanner;
public class Uri2 {
public static void main(String[] args) {
    final double pi = 3.14159;
    Scanner teclado = new Scanner(System.in);
    double raio = teclado.nextDouble();
    double area = pi * Math.pow(raio, 2);
    System.out.printf("A=%.4f%n" , area);
    teclado.close();
 }
}
