package tarefa09;
import java.util.Scanner;
public class Exercicio09 {
public static void main(String[] args) {

// Elaborar um programa que efetue a leitura de valores positivos inteiros até que um valor negativo seja informado. Ao final devem ser apresentados o maior e o menor valores informados pelo usuário.

        Scanner input = new Scanner(System.in);
        int valor;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        System.out.println("Digite os valores positivos inteiros (digite um valor negativo para encerrar):");

        while (true) {
        valor = input.nextInt();

        if (valor < 0) {
        break;
        }

        if (valor > maior) {
        maior = valor;
        }
        if (valor < menor) {
        menor = valor;
        }
        }
        System.out.println("Maior valor informado: " + maior);
        System.out.println("Menor valor informado: " + menor);

        input.close();
	}

}
