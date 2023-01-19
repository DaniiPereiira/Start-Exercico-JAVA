package ExercicioSete;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Informe a temperatura em graus Celsius: ");
        double tempC = leitorScanner.nextDouble();
        double tempF = (9*tempC+160)/5;

        System.out.println(tempF+"ºF");

    }
}
