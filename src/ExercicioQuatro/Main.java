package ExercicioQuatro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome;
        double salarioFixo, vendas, comissao, salarioFinal;

        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Nome:");
        nome = leitorScanner.next();
        System.out.println("Salário Fixo: ");
        salarioFixo = leitorScanner.nextDouble();
        System.out.println("Valor das Vendas: ");
        vendas = leitorScanner.nextDouble();

        comissao = vendas * 0.15;

        salarioFinal = salarioFixo + comissao;

        System.out.println("Nome: " + nome  +", Salário: " + salarioFinal);

    }
}
