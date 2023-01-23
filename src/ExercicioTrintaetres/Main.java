package ExercicioTrintaetres;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        int pagamento, nivel, horas;
        String nome;
        String resposta = "";

        do {
            System.out.println("Informe o nome do professor: ");
            nome = leitorScanner.next();
            System.out.println("Informe o nível do professor: ");
            nivel = leitorScanner.nextInt();
            System.out.println("Informe a quantidade de horas: ");
            horas = leitorScanner.nextInt();

            switch (nivel) {
                case 1:
                    pagamento = 12 * horas;
                    System.out.println(nome + " receberá: " + "R$ " + pagamento);
                    break;
                case 2:
                    pagamento = 17 * horas;
                    System.out.println(nome + " receberá: " + "R$ " + pagamento);
                    break;
                case 3:
                    pagamento = 25 * horas;
                    System.out.println(nome + " receberá: " + "R$ " + pagamento);
                    break;
                default:
                    System.out.println("Nível não existe");
            }

            System.out.println("Informe 0 para finalizar e 1 para continuar");
            resposta = leitorScanner.next();

        }while (resposta.equals("1"));

    }
}
