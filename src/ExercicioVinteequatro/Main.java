package ExercicioVinteequatro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        int numero  = leitorScanner.nextInt();

        if(numero < 0){
            System.out.println("Negativo");
        } else if (numero > 0) {
            System.out.println("Positivo");

        }else{
            System.out.println("Zero");
        }

    }
}
