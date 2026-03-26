//MATRICULA:1261946795
//NOME:DANIEL ANDRADE LOPES
import java.util.Scanner;

public class ConversorUnidades {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcao = -1; 

        while (opcao != 0) {

            
            
            System.out.println("=== CONVERSOR DE UNIDADES ===");
            System.out.println("1 - Quilômetros para Milhas");
            System.out.println("2 - Celsius para Fahrenheit");
            System.out.println("3 - Quilogramas para Libras");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a distância em km: ");
                    double km = entrada.nextDouble();
                    double milhas = km * 0.621371;
                    System.out.println(km + " km = " + milhas + " milhas\n");
                    break;

                case 2:
                    System.out.print("Digite a temperatura em Celsius: ");
                    double celsius = entrada.nextDouble();
                    double fahrenheit = (celsius * 9 / 5) + 32;
                    System.out.println(celsius + "°C = " + fahrenheit + "°F\n");
                    break;

                case 3:
                    System.out.print("Digite o peso em kg: ");
                    double kg = entrada.nextDouble();
                    double libras = kg * 2.20462;
                    System.out.println(kg + " kg = " + libras + " libras\n");
                    break;

                case 0:
                    System.out.println("Encerrando. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida!\n");
            }
        }

        entrada.close();
    }
}