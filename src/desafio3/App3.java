/**
 * Desafio 3
 *  Esta classe representa o aplicativo que lê um valor alvo 
 * depois o tamanho do array
 * e por último lê os valores do array
 * Após isso ele utiliza a função contNumeroDePares()
 * que passa em todos os valores fazendo o teste para ver se a diferença é igual ao valor alvo
 * e retorna esse valor.
 * 
 * @autor Miromar Francisco de Alcantara Junior
 * 
 * 
 */

package desafio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> arrayInformado = new ArrayList<>();

        System.out.println("Informe o valor alvo !");
        int valorAlvo = scan.nextInt();

        System.out.println("Informe o tamanho do array");
        int tamanhoArray = scan.nextInt();

        for (int i = 0; i < tamanhoArray; i++) {
            System.out.println("Informe o " + (i + 1) + " valor do array");
            arrayInformado.add(scan.nextInt());

        }
        scan.close();

        int count = contNumeroDePares(arrayInformado, valorAlvo);
        System.out.println("Número de pares com diferença igual a " + valorAlvo + " é =  " + count);

    }

    public static int contNumeroDePares(List<Integer> arr, int k) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(i) - arr.get(j) == k) {
                    count++;
                }
            }

        }

        return count;
    }

}
