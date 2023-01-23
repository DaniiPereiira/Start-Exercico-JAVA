package ExercicioVinteesete;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        int valor = 1;
        String combustivel;

        while (valor != 0) {

            System.out.println("Informe o valor do carro:");
            valor = leitorScanner.nextInt();
            if(valor == 0){
                break;

            }
            System.out.println("Informe o Combustível do carro:");
            combustivel = leitorScanner.next();

           if(combustivel.equals("álcool")){
                double desconto = valor*0.25;
                double totalPago = valor-desconto;
                System.out.println("Desconto: " + desconto );
                System.out.println("Total pago: " + totalPago );
            } else if(combustivel.equals("gasolina")){
                double desconto = valor*0.21;
                double totalPago = valor-desconto;
                System.out.println("Desconto: " + desconto );
                System.out.println("Total pago: " + totalPago );
            } else if(combustivel.equals("diesel")){
                double desconto = valor*0.14;
                double totalPago = valor-desconto;
                System.out.println("Desconto: " + desconto );
                System.out.println("Total pago: " + totalPago );
            } else {
                System.out.println("Opção inválida");
            }


        };

    }
}
