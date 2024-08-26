import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri9 {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double A = teclado.nextDouble(); 
    double B = teclado.nextDouble(); 
    double C = teclado.nextDouble(); 
    //a)
    double base = A;
    double altura = C;
    double areaDoTriangulo = (base * altura)/2;
    double areaTotalDoTriangolo = areaDoTriangulo;
    DecimalFormat df = new DecimalFormat("#0.000");
    System.out.println("TRIANGULO: "+df.format(areaTotalDoTriangolo));
    //b)
    final double pi = 3.14159;
    double raio = C;
    double area = pi * Math.pow(raio, 2);
    double areaDoCirculo = area;
    System.out.println("CIRCULO: "+df.format(areaDoCirculo));
    //c)
    double base1 = A;
    double base2 = B;
    double alturaCc = C;
    double calculoTrapezio = ((base1 + base2)*alturaCc)/2;
    double areaDoTrapezio = calculoTrapezio;
    System.out.println("TRAPEZIO: "+df.format(areaDoTrapezio));
    //d)
    double lado = B;
    double calculDoQuadrado = B * B;
    double areaDoQuadrado = calculDoQuadrado;
    System.out.println("QUADRADO: "+df.format(areaDoQuadrado));
    //e)
    double ladoA = A;
    double ladoB = B;
    double calculDoRetangulo = A * B;
    double areaDoRetangulo = calculDoRetangulo;
    System.out.println("RETANGULO: "+df.format(areaDoRetangulo));
    teclado.close();
}
}
