package ExercicioOnze;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Informe o valor de custo: ");
        double valorCusto = leitorScanner.nextDouble();
        System.out.println("Informe o percentual: ");
        double percentual = leitorScanner.nextDouble();

        double valorVenda = valorCusto + (valorCusto*(percentual/100));

        System.out.println("O valor de venda é: R$ " + valorVenda);

    }
}
