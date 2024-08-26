import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float x1 = teclado.nextFloat();
        float y1 = teclado.nextFloat();
        float x2 = teclado.nextFloat();
        float y2 = teclado.nextFloat();
        double distancia = calcularDistancia(x1,y1,x2,y2);
        DecimalFormat df = new DecimalFormat("##.0000");
        System.out.println(df.format(distancia));

        teclado.close();
    }
    public static double calcularDistancia(float x1,float y1,float x2,float y2){
        return  Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1, 2));
    }
}
