package tarefa09;
public class Exercicio03 {
public static void main(String[] args) {

// Apresentar todos os números divisíveis por 4 que sejam menores que 200. Para verificar se o número é divisível por 4, efetuar dentro da malha a verificação lógica desta condição com a instrução se, perguntando se o número é divisível; sendo, mostre-o; não sendo, passe para o próximo passo. A variável que controlará o contador deve ser iniciada com o valor 1.

        String total = ""; 
        for (int i = 1; i < 200; i++) {
            if (i % 4 == 0) {
                total += i + ", ";
            }
        }
        System.out.println("Números divisíveis por 4 menores que 200: " + total);
	}

}
