package ExercicioNove;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        double deposito = leitorScanner.nextDouble();

        double rendimento = deposito*0.07;

        System.out.println(rendimento);

    }
}
