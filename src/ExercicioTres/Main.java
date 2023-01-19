package ExercicioTres;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double distancia, combustivel;

        Scanner leitorScanner = new Scanner(System.in);

        distancia = leitorScanner.nextDouble();
        combustivel = leitorScanner.nextDouble();

        System.out.println(distancia/combustivel);
    }
}
