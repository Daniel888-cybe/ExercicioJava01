import java.util.Scanner;
//MATRICULA:1261946795
//NOME:DANIEL ANDRADE LOPES
public class ClassificacaoTriangulo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Lado A: ");
        int A = entrada.nextInt();

        System.out.print("Lado B: ");
        int B = entrada.nextInt();

        System.out.print("Lado C: ");
        int C = entrada.nextInt();

        if (A == B && B == C) {
            System.out.println("Triângulo Equilátero.");

        } else if (A == B || A == C || B == C) {
            System.out.println("Triângulo Isósceles.");

        } else {
            System.out.println("Triângulo Escaleno.");
        }

        entrada.close();
    }
}
    

