package ExercicioTrintaecinco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        String tipo;
        int hora;
        double valor;

        System.out.println("Informe o tipo do cliente: ");
        tipo = leitorScanner.next();
        System.out.println("Informe a quantidade de horas:");
        hora = leitorScanner.nextInt();

        switch (tipo){
            case "Residência": valor = 0.60 * hora;
                System.out.println("R$ "+valor);
            break;
            case "Comércio": valor = 0.48 * hora;
                System.out.println("R$ "+valor);
                break;
            case "Indústria": valor = 1.29 * hora;
                System.out.println("R$ "+valor);
                break;
        }

    }
}
