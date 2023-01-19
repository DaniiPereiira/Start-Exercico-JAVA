package ExercicioOito;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Informe quanto deseja converter: ");
        double dolar = leitorScanner.nextDouble();
        System.out.println("Infome a cotação: ");
        double cotacao = leitorScanner.nextDouble();
        double real = dolar*cotacao;

        System.out.println(real+" Real brasileiro");



    }
}
