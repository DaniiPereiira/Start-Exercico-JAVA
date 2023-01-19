package ExercicioDezenove;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        String nome, sexo;
        String F = "F";
                String M= "M";
        List homem = new ArrayList<>();
        List mulher = new ArrayList<>();

        for(int i=0; i<56; i++){

            System.out.println("Informe o nome: ");
            nome = leitorScanner.next();
            System.out.println("Informe o sexo (F ou M)");
            sexo = leitorScanner.next();

            if(sexo.equals("F")){
                System.out.println("Mulher\n");
                mulher.add(sexo);
            } else if (sexo.equals("M")) {
                System.out.println("Homem\n");
                homem.add(sexo);
            }else {
                System.out.println("Opção Inválida\n");
            }

        }

        System.out.println("Total de mulheres: " + mulher.toArray().length);

        System.out.println("Total de homens: " + homem.toArray().length);

    }
}
