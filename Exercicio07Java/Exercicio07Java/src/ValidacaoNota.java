//MATRICULA:1261946794
//NOME:DANIEL ANDRADE LOPES
import java.util.Scanner;

public class ValidacaoNota {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota (0 a 100): ");
        int nota = entrada.nextInt();

        while (nota < 0 || nota > 100) {

            System.out.println("Nota inválida. Tente novamente.");

            System.out.print("Digite a nota (0 a 100): ");
            nota = entrada.nextInt();

        }

        if (nota >= 90) {
            System.out.println("Conceito: A");
        }
        else if (nota >= 75) {
            System.out.println("Conceito: B");
        }
        else if (nota >= 60) {
            System.out.println("Conceito: C");
        }
        else {
            System.out.println("Conceito: D (Reprovado)");
        }

        entrada.close();
    }
}