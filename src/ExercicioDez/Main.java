package ExercicioDez;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Informe o valor da compra: ");

        double valorCompra = leitorScanner.nextDouble();
        double valorPrestacao = valorCompra/5;

        System.out.println("O valor da pretação é de: R$ "+valorPrestacao);

    }
}
