package tarefa09;
import java.util.Scanner;
public class Exercicio10 {
public static void main(String[] args) {

// Elaborar um programa que apresente o resultado inteiro da divisão de dois números quaisquer. Para a elaboração do programa, não utilizar em hipótese alguma o conceito do operador aritmético DIV. A solução deve ser alcançada com a utilização de looping. Ou seja, o programa deve apresentar como resultado (quociente) quantas vezes o divisor cabe no dividendo.

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o dividendo (número a ser dividido):");
        int dividendo = input.nextInt();

        System.out.println("Digite o divisor (número pelo qual será dividido):");
        int divisor = input.nextInt();

        int quociente = 0;
        while (dividendo >= divisor) {
            dividendo -= divisor;
            quociente++;
        }

        System.out.println("O quociente da divisão é: " + quociente);

        input.close();	}

}
