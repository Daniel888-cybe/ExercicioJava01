import java.util.Scanner;
// MATRICULA:1261946795 
// NOME: DANIEL ANDRADE LOPES
public class fasskfjs{

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = leitor.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = leitor.nextDouble();

        System.out.println("Operações: 1-Soma 2-Subtração 3-Multiplicação 4-Divisão");
        System.out.print("Escolha: ");
        int operacao = leitor.nextInt();

        double resultado;

        switch (operacao) {

            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;

            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;

            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;

            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: divisão por zero.");
                }
                break;

            default:
                System.out.println("Operação inválida.");
        }

        leitor.close();
    }
}

