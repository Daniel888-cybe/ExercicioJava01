//DANIEL ANDRADE LOPES
// MATRICULA:1261946796

import java.util.Scanner;

public class ParouImpar {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " é par.");
        } else {
            System.out.println(numero + " é impar.");
        }

        entrada.close();
    }
}