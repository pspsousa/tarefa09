package tarefa09;
import java.util.Scanner;
public class Exercicio06 {
public static void main(String[] args) {

// Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do somatório, a média aritmética e o total de valores lidos. O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor negativo. Não se esqueça que o usuário pode entrar como primeiro número um número negativo, portanto, cuidado com a divisão por zero no cálculo da média.

	Scanner scanner = new Scanner(System.in);
        int totalValores = 0;
        int soma = 0;

        System.out.println("Informe valores positivos (digite um número negativo para parar):");

        while (true) {
            System.out.print("Digite um valor: ");
            int valor = scanner.nextInt();

            if (valor < 0) {
                break;            }

            soma += valor;
            totalValores++;
        }

        if (totalValores > 0) {
            double media = (double) soma / totalValores;
            System.out.println("A soma dos valores é: " + soma);
            System.out.println("O total de valores lidos é: " + totalValores);
            System.out.println("A média dos valores é: " + media);
        } else {
            System.out.println("Nenhum valor positivo foi informado.");
	scanner.close();

	}

}
