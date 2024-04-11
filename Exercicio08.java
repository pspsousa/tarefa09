package tarefa09;
import java.util.Scanner;
public class Exercicio08 {
public static void main(String[] args) {

// Elaborar um programa que possibilite calcular a área total de uma residência (sala, cozinha, banheiro, quartos, área de serviço, quintal, garagem, etc.). O programa deve solicitar a entrada do nome, a largura e o comprimento de um determinado cômodo. Em seguida, deve apresentar a área do cômodo lido e também uma mensagem solicitando do usuário a confirmação de continuar calculando novos cômodos. Caso o usuário responda “NAO”, o programa deve apresentar o valor total acumulado da área residencial


	Scanner input = new Scanner(System.in);
        double areaTotal = 0.0;

        System.out.println("Bem-vindo à Calculadora de Áreas Residenciais!");

        while (true) {
        System.out.println("Informe o nome do cômodo (ou 'NAO' para encerrar):");
        String nomeComodo = input.nextLine();

        if (nomeComodo.equalsIgnoreCase("NAO")) {
        break;
        }

        System.out.println("Informe a largura do cômodo em metros:");
        double largura = input.nextDouble();

        System.out.println("Informe o comprimento do cômodo em metros:");
        double comprimento = input.nextDouble();

        double areaComodo = calcularArea(largura, comprimento);
        areaTotal += areaComodo;

        System.out.println("Área do cômodo '" + nomeComodo + "': " + areaComodo + " m²");
        input.nextLine(); // Limpa o buffer

        System.out.println("Deseja calcular outro cômodo? (Digite 'NAO' para encerrar)");
        String resposta = input.nextLine();

        if (resposta.equalsIgnoreCase("NAO")) {
        break;
            }
        }

        System.out.println("Área total da residência: " + areaTotal + " m²");
        input.close();
	}

	public static double calcularArea(double largura, double comprimento) {
        return largura * comprimento;

	input.close();

	}

}
