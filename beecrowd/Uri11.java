import java.util.Scanner;

public class Uri11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int km = teclado.nextInt();
        int carroX = 60;
        int carroY = 90;
        int distancia = km * 2;
        System.out.println(distancia+" minutos");
        teclado.close();
    }
}
