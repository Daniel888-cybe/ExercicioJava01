//MATRICULA:1261946795
//NOME:DANIEL ANDRADE 
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número: ");
        int numero = entrada.nextInt();

        int multiplicador = 1;

        while (multiplicador <= 10) {

            int resultado = numero * multiplicador;

            System.out.println(numero + " x " + multiplicador + " = " + resultado);

            multiplicador++;
        }

        entrada.close();
    }
}