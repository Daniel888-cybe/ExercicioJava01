//MATRICULA:1261946795
//NOME:DANIEL ANDRADE LOPES
import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double saldo = 1000.00;
        int opcao = -1; 

        while (opcao != 0) {

            
            System.out.println("=== CAIXA ELETRÔNICO ===");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar saldo");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = entrada.nextInt();

            switch (opcao) {

                case 1: 
                    System.out.print("Valor do depósito: R$ ");
                    double deposito = entrada.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.printf("Depósito realizado. Novo saldo: R$ %.2f%n%n", saldo);
                    } else {
                        System.out.println("Valor inválido. Digite um valor positivo.");
                    }
                    break;

                case 2: 
                    System.out.print("Valor do saque: R$ ");
                    double saque = entrada.nextDouble();
                    if (saque <= saldo && saque > 0) {
                        saldo -= saque;
                        System.out.printf("Saque realizado. Novo saldo: R$ %.2f%n%n", saldo);
                    } else if (saque > saldo) {
                        System.out.printf("Saldo insuficiente. Saldo disponível: R$ %.2f%n%n", saldo);
                    } else {
                        System.out.println("Valor inválido. Digite um valor positivo.\n");
                    }
                    break;

                case 3: 
                    System.out.printf("Saldo atual: R$ %.2f%n%n", saldo);
                    break;

                case 0: 
                    System.out.println("Obrigado. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida!\n");
            }
        }

        entrada.close();
    }
}