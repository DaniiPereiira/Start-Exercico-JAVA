package ExercicioDoze;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        double custoFabrica = leitorScanner.nextDouble();

        double custoConsumidor = ((custoFabrica + (custoFabrica * 0.28)) * 0.45) + (custoFabrica + (custoFabrica * 0.28));

        System.out.println(custoConsumidor);
;
    }
}
