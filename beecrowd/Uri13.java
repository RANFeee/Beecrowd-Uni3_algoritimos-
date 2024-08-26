import java.util.Scanner;

public class Uri13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tempoEmSec = teclado.nextInt();
        int horas = tempoEmSec / 3600; // voce vai dividir o "tempoEmSec" por 3600 pq 1h tem 3600
        int minutos = (tempoEmSec % 3600) / 60; //  pega resto da divisão de "tempoEmSec" por 3600  e depois, dividimos esse valor por 60 para obter o número de minutos.
        int segundos = tempoEmSec % 60; // calcula o resto da divisão de "tempoEmSec" por 60
        System.out.println(horas+":"+minutos+":"+segundos);
        teclado.close();
    }
}
