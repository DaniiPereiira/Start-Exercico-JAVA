package ExercicioTrintaedois;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        int num1, num2, num3;


        System.out.println("Informe três núemros: ");
        num1 = leitorScanner.nextInt();
        num2 = leitorScanner.nextInt();
        num3 = leitorScanner.nextInt();


        if(num1 < num2+num3 && num2 < num1+num3 && num3 < num1+num2){
            if(num1 == num2 && num2 == num3){
                System.out.println("Triângulo Equilátero");
            } else if (num1 == num2 || num1 == num3 || num2 == num3) {
                System.out.println("Triângulo Isócele");
            } else if (num1 != num2 && num2 != num3) {
                System.out.println("Triângulo Escaleno");

            }

        }else {
            System.out.println("Não é um triângulo");
        }

    }
}
