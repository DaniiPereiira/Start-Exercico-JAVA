package ExercicioVinteeseis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        int numero = leitorScanner.nextInt();

        switch (numero){
            case 1:
                System.out.println("Um");
            case 2:
                System.out.println("Dois");
            case 3:
                System.out.println("Três");
            case 4:
                System.out.println("Quatro");
            case 5:
                System.out.println("Cinco");
        }
        if (numero >5){
            System.out.println("Número Inválido");
        }

    }
}
