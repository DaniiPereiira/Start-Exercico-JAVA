package ExercicioVinteedois;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);
        int precoCusto, precoVenda;
        List <Integer>listaCusto = new ArrayList<>();
        List <Integer>listaVenda = new ArrayList<>();
        int somaCusto = 0;
        int somaVenda = 0;

       // double somaCusto, somaVenda;

        for(int i =0; i<40; i++){

            System.out.println("Informe preço de custo de produto: ");
            precoCusto = leitorScanner.nextInt();
            listaCusto.add(precoCusto);
            System.out.println("Informe o preço de venda do produto: ");
            precoVenda = leitorScanner.nextInt();
            listaVenda.add(precoVenda);

            if(precoCusto < precoVenda){
                System.out.println("Lucro");
            } else if (precoCusto > precoVenda) {
                System.out.println("Prejuízo");

            }else {
                System.out.println("Empate");
            }


        }

        for(int i =0; i<40; i++){

            int p = i+1;

            System.out.println("Produto "+ p +": Valor de custo: "+ listaCusto.get(i) + ", Valor de venda " + listaVenda.get(i));
        }

        for(int i =0; i<40; i++){


          somaCusto =  listaCusto.stream().reduce(Integer::sum).get();
          somaVenda = listaVenda.stream().reduce(Integer::sum).get();
        }

        double mediaCusto = somaCusto / listaCusto.toArray().length;
        double mediaVenda = somaVenda / listaCusto.toArray().length;

        System.out.println("Média de Custo: " + mediaCusto + ", Média de Venda: " + mediaVenda);

    }
}
