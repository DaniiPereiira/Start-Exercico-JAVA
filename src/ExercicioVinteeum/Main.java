package ExercicioVinteeum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        String nome, sexo;
        int idade;

        int qtdPessoas = 1;
        List apta = new ArrayList<>();
        List naoApta = new ArrayList<>();

        while (qtdPessoas == 1){

            System.out.println("Informe o nome ou fim para finalizar:");
            nome = leitorScanner.next();

            if(nome.equals("fim")){
                break;
            };
            System.out.println("Informe a idade:");
            idade = leitorScanner.nextInt();
            System.out.println("Informe o sexo:");
            sexo = leitorScanner.next();

            if(idade>=18 && sexo.equals("masculino")){
                apta.add(nome);
                System.out.println("Apta");
            }else {
                naoApta.add(nome);
                System.out.println("Não Apta");
            }




        }

        System.out.println("Quantidade de pessoas aptas: "+ apta.toArray().length);
        System.out.println("Quantidade de pessoas não aptas: "+ naoApta.toArray().length);


    }
}
