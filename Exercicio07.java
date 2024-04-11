package tarefa09;
public class Exercicio07 {
public static void main(String[] args) {

	// Elaborar um programa que apresente como resultado o valor do fatorial dos valores ímpares situados na faixa numérica de 1 a 10.

	long resultado = 1;

	for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                resultado *= fatorial(i);
            }
        }

	System.out.println("O fatorial dos valores ímpares de 1 a 10 é: " + resultado);
	}
	
	public static long fatorial(int n) {
        long fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
	}
	return fatorial;		
	}

}
