package ExercicioVinteetres;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        int numero = leitorScanner.nextInt();

        if(numero < 25) {
            System.out.println("Menor que 25");
        } else if (numero == 40) {
            System.out.println("Igual a 40");
        } else if (numero< 80) {
            System.out.println("Menor que 80");

        }

    }
}
