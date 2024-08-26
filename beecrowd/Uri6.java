import java.util.Scanner;

public class Uri6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int funcionarios = teclado.nextInt();
        int horas = teclado.nextInt();
        double salario = teclado.nextDouble();
        double salarioPorHora = salario * horas;
        System.out.println("NUMBER = " + funcionarios);
        System.out.printf("SALARY = U$ %.2f%n" , salarioPorHora);
        teclado.close();
    }
}
