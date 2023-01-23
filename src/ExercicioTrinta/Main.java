package ExercicioTrinta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);

        int num;
        List<Integer> listaNum = new ArrayList<>();

        for(int i=0; i<3; i++){
            System.out.println("Informe um número:");
            num = leitorScanner.nextInt();
            listaNum.add(num);
        }

        Collections.sort(listaNum);

        System.out.println("Números informados em ordem crescente: "+listaNum);
    }
}
