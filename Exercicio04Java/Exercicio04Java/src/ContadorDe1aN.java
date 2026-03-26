// MATRICULA:1231946795
//NOME:DANIEL ANDRADE LOPES
import java.util.Scanner;

public class ContadorDe1aN {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite N: ");
        int N = leitor.nextInt();

        if (N <= 0) {

            System.out.println("Valor inválido. N deve ser maior que zero.");

        } else {

            int contador = 1;

            while (contador <= N) {

                System.out.println(contador);

                contador++;

            }

            System.out.println("Contagem concluída.");
        }

        leitor.close();
    }
}