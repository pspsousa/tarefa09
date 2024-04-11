package tarefa09;
public class Exercicio04 {
public static void main(String[] args) {

//Elaborar um programa que efetue o cálculo e no final apresente o somatório do número de grãos de trigo que se pode obter num tabuleiro de xadrez, obedecendo à seguinte regra: colocar um grão de trigo no primeiro quadro e nos quadros seguintes o dobro do quadro anterior. Ou seja, no primeiro quadro coloca-se 1 grão, no segundo quadro colocam-se 2 grãos (neste momento têm-se 3 grãos), no terceiro quadro colocam-se 4 grãos (tendo neste momento 7 grãos), no quarto colocam-se 8 grãos (tendo-se então 15 grãos) até atingir o sexagésimo quarto (64o) quadro. Utilize variáveis do tipo real como acumuladores


        int numQuadros = 64;
        long graosNoQuadro = 1;
        long totalGraos = graosNoQuadro;

        for (int i = 2; i <= numQuadros; i++) {
            graosNoQuadro *= 2;
            totalGraos += graosNoQuadro;
        }

        System.out.println("Total de grãos no tabuleiro de xadrez: " + totalGraos);


	}

}
