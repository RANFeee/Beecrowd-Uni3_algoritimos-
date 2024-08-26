import java.util.Scanner;

public class Uri4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final double nota1 = teclado.nextDouble();
        final double nota2 = teclado.nextDouble();
        double pesoA=3.5;
        double pesoB=7.5;
        double media = (nota1 * pesoA + nota2 * pesoB) / (pesoA + pesoB);
        System.out.printf("MEDIA = %.5f%n" , media);
        teclado.close();
    }
}
