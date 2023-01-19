package ExercicioCinco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome;
        double nota1, nota2, nota3, media;

        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Nome do aluno: ");
        nome = leitorScanner.next();
        System.out.println("Informe as três notas:");
        nota1 = leitorScanner.nextDouble();
        nota2 = leitorScanner.nextDouble();
        nota3 = leitorScanner.nextDouble();

        media = (nota1+nota2+nota3)/3;

        System.out.println("Nome: " + nome + ", Média: " + media);


    }
}
