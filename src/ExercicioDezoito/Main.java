package ExercicioDezoito;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        int idade;

        for(int i =0; i<75; i++){
            idade = leitorScanner.nextInt();

            if(idade >=18){

                System.out.println("Maior Idade");
            }else {

                System.out.println("Menor Idade");
            }
        }



    }
}
