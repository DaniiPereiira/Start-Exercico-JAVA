package ExercicioDezessete;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        int numero;
        List numeros = new ArrayList<>();


        for (int i = 0; i<5; i++){

            numero = leitorScanner.nextInt();
          if (numero >= 10 && numero <=150){
              numeros.add(numero);
          }

        }



        System.out.println(numeros.toArray().length);




    }
}
