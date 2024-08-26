import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor = teclado.nextInt();
        System.out.println(valor);
        int[] notas = {100,50,20,10,5,2,1};
        DecimalFormat df = new DecimalFormat("##0");
        for (int nota : notas){
            int qtdNotas = valor / nota;
            valor %= nota;
            System.out.printf("%d nota(s) de R$ %s,%s%n",qtdNotas, df.format(nota),"00");
        }
        teclado.close();
    }
}
