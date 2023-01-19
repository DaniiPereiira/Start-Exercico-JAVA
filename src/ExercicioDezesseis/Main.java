package ExercicioDezesseis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

       double nota1 = leitorScanner.nextDouble();
        double nota2 = leitorScanner.nextDouble();
        double nota3= leitorScanner.nextDouble();

        double media = (nota1 + nota2 + nota3)/3;

        if (media >= 7) {
            System.out.println("Aprovado");
        }else if(media<=5){
            System.out.println("Reprovado");
        }else {
            System.out.println("Recuperação");
        }
    }
}
