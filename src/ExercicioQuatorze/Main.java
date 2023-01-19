package ExercicioQuatorze;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        int num1 = leitorScanner.nextInt();
        int num2 = leitorScanner.nextInt();

        if (num1 > num2){
            System.out.println("O número maior é: "+num1);
        } else if (num2 > num1) {
            System.out.println("O número maior é: "+num2);

        }else {
            System.out.println("Os dois números são iguais");
        }

    }
}
