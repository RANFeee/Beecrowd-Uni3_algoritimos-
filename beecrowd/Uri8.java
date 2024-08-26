import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int codigoPeca1 = teclado.nextInt();
        int nmrDePeca1 = teclado.nextInt();
        double valorPeca1 = teclado.nextDouble();
        int codigoPeca2 = teclado.nextInt();
        int nmrDePeca2 = teclado.nextInt();
        double valorPeca2 = teclado.nextDouble();
        double total = nmrDePeca1 * valorPeca1;
        double total2 = nmrDePeca2 * valorPeca2;
        double soma = total + total2;
        double valorTotal = soma;
        
        DecimalFormat formato = new DecimalFormat("##0.00");      
        
        System.out.println("VALOR A PAGAR: R$ "+ formato.format(valorTotal));
        
        teclado.close();
       
    }
}
