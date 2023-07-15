
/**
 * Desafio 4
 *Este plicativo primeiro recebe a quantidade de linhas a serem desembaralhadas
 *Depois pede para informar todas as linhas, e elas são adicionadas a uma lista chamada arrayString
 *Após isso chamo o método desembaralhaLinhas() dentro de um laço for para imprimir as linhas corretas
 * 
 * Esse método primeiro cria uma váriavel com o tamanho dos caracteres passado na primeira linha
 * divide por 2, e com a classe StringBuilder crio uma váriavel para pegar o tamanho total da linha
 * depois divido por 2 para pegar a metade e primeiro pego a metade -1 no laço for e vou fazendo o decremento
 * para ordenar as da esquerda e depois um outro for só que agora do final que é a direita
 * do ultimo -1 para a metade e ordeno para ordem correta e depois ´´e só retornar o valor da linha toda
 * E isso se repete até terminar as linhas
 * 
 * @autor Miromar Francisco de Alcantara Junior
 * 
 * 
 */

package desafio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o nr de Casos de Teste");
        int qtdCasosDeTeste = scan.nextInt();

        List<String> arrayStrings = new ArrayList<>();

        System.out.println("Informe linha por linha até o total de casos");
        scan.nextLine();

        for (int i = 0; i < qtdCasosDeTeste; i++) {
            arrayStrings.add(scan.nextLine());
        }

        System.out.println("\nLinhas Corretas");
        for (String string : arrayStrings) {
            String linhaCorreta = desembaralhaLinhas(string);
            System.out.println(linhaCorreta);
        }

        scan.close();

    }

    public static String desembaralhaLinhas(String line) {
        int length = line.length();
        int mid = length / 2;
        StringBuilder stringBuilder = new StringBuilder(length);

        for (int i = mid - 1; i >= 0; i--) {
            stringBuilder.append(line.charAt(i));
        }

        for (int i = length - 1; i >= mid; i--) {
            stringBuilder.append(line.charAt(i));
        }

        return stringBuilder.toString();

    }

}
