package tarefa09;
import java.util.Scanner;
public class Exercicio05 {
public static void main(String[] args) {

// Elaborar um programa que efetue a leitura de 15 valores numéricos inteiros e no final apresente ototal do somatório da fatorial de cada valor lido.

	Scanner scanner = new Scanner(System.in);
        int totalValores = 15;
        long somaFatorial = 0;

        for (int i = 1; i <= totalValores; i++) {
        System.out.print("Digite o valor " + i + ": ");
        int valor = scanner.nextInt();
        long fatorial = calcularFatorial(valor);
        somaFatorial += fatorial;
        }

        System.out.println("O somatório dos fatoriais é: " + somaFatorial);
	}

	public static long calcularFatorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
        resultado *= i;
        }
        return resultado;

	scanner.close();
	}

}
