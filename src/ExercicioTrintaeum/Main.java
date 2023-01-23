package ExercicioTrintaeum;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        double A, B, result;
        String C;

        System.out.println("Informe dois números: ");
        A = leitorScanner.nextDouble();
        B = leitorScanner.nextDouble();

        System.out.println("Informe um caractere: ");
        C = leitorScanner.next();

        switch (C){
            case "+":
                result = A+B;
                System.out.println(result);
                break;
            case "-":
                result = A-B;
                System.out.println(result);
                break;
            case "*":
                result = A*B;
                System.out.println(result);
                break;
            case "/":
                result = A/B;
                System.out.println(result);
                break;
            default:
                System.out.println("Operador não definido");
                break;
        }

    }
}
