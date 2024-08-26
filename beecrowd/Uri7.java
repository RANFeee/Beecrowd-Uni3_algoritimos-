import java.util.Scanner;

public class Uri7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nomeVendedor = teclado.next();
        double salario1 = teclado.nextDouble();
        double vendarPorMes = teclado.nextDouble();
        double porcentual = 0.15;
        double valorPorcetual = porcentual * vendarPorMes;
        double salarioFinalDoMes = valorPorcetual + salario1;
        System.out.printf("TOTAL = R$ %.2f%n", salarioFinalDoMes);
        teclado.close();
    }
}
