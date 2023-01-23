package ExercicioTrintaequatro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);
        String resposta;
        int idade;


        do{

            System.out.println("Infome a idade do nadador: ");
            idade = leitorScanner.nextInt();

            if (idade >= 5 && idade <=7){
                System.out.println("Categoria Infantil A");
            } else if (idade >= 8 && idade <=10){
                System.out.println("Categoria Infantil B");
            } else if (idade >= 11 && idade <=13){
                System.out.println("Categoria Juvenil A");
            }  else if (idade >= 14 && idade <=17){
            System.out.println("Categoria Juvenil B");
        } else if (idade >= 18 && idade <=25){
            System.out.println("Categoria Sênior");
        }else {
                System.out.println("Idade fora da faixa etária");
            }

            System.out.println("Informe 0 para finalizar e 1 para continuar");
            resposta = leitorScanner.next();

        }while (resposta.equals("1"));




    }
}
