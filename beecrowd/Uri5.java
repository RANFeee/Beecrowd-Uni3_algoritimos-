import java.util.Scanner;

public class Uri5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int A = teclado.nextInt();
        int B = teclado.nextInt();
        int C = teclado.nextInt();
        int D = teclado.nextInt();
        int diferenca = (A * B) - (C * D);
        System.out.println("DIFERENCA = " + diferenca);
        teclado.close();
    }
}
