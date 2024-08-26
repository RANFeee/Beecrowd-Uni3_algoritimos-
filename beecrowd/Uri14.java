import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valor = teclado.nextDouble();
        int centavos = (int) Math.round(valor * 100);
        int[] notas = {10000,5000,2000,1000,500,200};  // ta em centavos
        int[] moedas = {100,50,25,10,5,1};//em centavos
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("NOTAS:");
        for (int nota : notas){
            int qtdNotas = centavos / nota;
            centavos %= nota;
            System.out.printf("%d nota(s) de R$ %s%n",qtdNotas, df.format(nota /100));
        }
        System.out.println("MOEDAS:");
        for (int moeda:moedas){
            int qtdMoedas = centavos / moeda;
            centavos %= moeda;
            System.out.printf("%d moeda(s) de R$ %s%n",qtdMoedas, df.format(moeda / 100)); // df.format ta convertendo o valor de centavos em reais
        }
        teclado.close();
    }
}
