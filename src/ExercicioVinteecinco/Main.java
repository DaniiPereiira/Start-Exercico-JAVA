package ExercicioVinteecinco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        int num1 = leitorScanner.nextInt();
        int num2 = leitorScanner.nextInt();

        if(num1 == num2){
            System.out.println("Números iguais");
        }else {
            if(num1>num2){
                System.out.println("Numeros diferes, o número maior é: " + num1);
            }else {
                System.out.println("Numeros diferes, o número maior é: " + num2);
            }
        }

    }
}
