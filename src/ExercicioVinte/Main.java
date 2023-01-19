package ExercicioVinte;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        double valorCarro, valorComDesconto, desconto;
        int anoCarro;
        String resposta;

        do{
            System.out.println("Informe o valor do carro");
            valorCarro = leitorScanner.nextDouble();
            System.out.println("Informe o ano do carro");
            anoCarro = leitorScanner.nextInt();

            if(anoCarro<=2000){
                desconto = (valorCarro*0.12);
                valorComDesconto = valorCarro - desconto;
                System.out.println("O valor do desconto é: R$ " + desconto + " O valor a ser pago é: R$ "+ valorComDesconto);
            }else {
                desconto = (valorCarro*0.07);
                valorComDesconto = valorCarro - desconto;
                System.out.println("O valor do desconto é: R$ " + desconto + " O valor a ser pago é: R$ "+ valorComDesconto);

            }

            System.out.println("\n Deseja continuar calculando? S(Sim), N(Não)");
            resposta = leitorScanner.next();

        } while (resposta.equals("S"));

    }
}
