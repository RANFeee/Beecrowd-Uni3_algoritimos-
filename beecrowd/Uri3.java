import java.util.Scanner;

public class Uri3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int var1 = teclado.nextInt();
        int var2 = teclado.nextInt();
        int prod = var1 * var2;
        System.out.println("PROD = "+prod);
        teclado.close();
    }
}
