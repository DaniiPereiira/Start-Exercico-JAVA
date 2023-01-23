package ExercicioVinteeoito;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        String nome;
        List<Double> aumentoSalario = new ArrayList<>();
        double salario;
        double aumento;
        double salarioMinimo;
        double salarioAtual;
        double totalAumento = 0;

        System.out.println("Informe o valor do salário mínimo");
        salarioMinimo = leitorScanner.nextDouble();

        for (int i = 0; i < 584; i ++){
            System.out.println("Informe o nome do funcionário: ");
            nome = leitorScanner.next();
            System.out.println("Informe o salário: ");
            salario = leitorScanner.nextDouble();

            if(salario / salarioMinimo < 3){
                aumento = salario * 0.50;
            }else  if(salario / salarioMinimo >= 3 && salario/salarioMinimo <=10){
                aumento = salario * 0.20;
            }else  if(salario / salarioMinimo > 10 && salario/salarioMinimo <= 20){
                aumento = salario * 0.15;
            } else{
                aumento = salario * 0.10;
            }
            aumentoSalario.add(aumento);

            totalAumento = aumentoSalario.stream().reduce(Double::sum).get();

            salarioAtual = salario + aumento;

            System.out.println("Nome: " + nome + ", Reajuste: " + aumento + ", Salario atual: " + salarioAtual );
        }

        System.out.println("O aumento na folha foi de: "+totalAumento);



    }
}
