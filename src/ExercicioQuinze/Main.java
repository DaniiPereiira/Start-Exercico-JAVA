package ExercicioQuinze;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        int num = leitorScanner.nextInt();


        if(num >= 100 && num <=200){
            System.out.println("Sim");
        }else{
            System.out.println("Não");
        }
    }
}