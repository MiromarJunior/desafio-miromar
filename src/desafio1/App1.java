

/**
 * Desafio 1
 *  Esta classe representa o aplicativo que lê uma quantidade de números inteiros não negativos que usuário irá informar.
 * Após isso o usuário vai inserindo os números e o aplicativo vai salvando em uma lista de números pares e uma de números impares.
 * Depois ordena os pares utilizando o Collections.sort em ordem crescente
 * e depois os impares primeiro são ordenados em ordem crescente para depois com o Collections.reverseOrder os colocam em ordem decrescente.
 * por último faz a união das duas listas e mostra o resultado esperado.
 * 
 * @autor Miromar Francisco de Alcantara Junior
 * 
 *
 */

 package desafio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> arrayPares = new ArrayList<>();
        List<Integer> arrayImPares = new ArrayList<>();
         List<Integer> arrayResultado = new ArrayList<>();

        System.out.println("Informe a quantidade de numeros !");
        int qtdLinhas = scan.nextInt();

        int numInformado = 0;

        for (int i = 0; i < qtdLinhas; i++) {
            System.out.println("Informe o "+ (1+i) +"º número");
            numInformado = scan.nextInt();
            if (numInformado % 2 == 0) {
                arrayPares.add(numInformado);
            } else {
                arrayImPares.add(numInformado);
            }

        }
        scan.close();

        Collections.sort(arrayPares);
        arrayResultado.addAll(arrayPares);

        Collections.sort(arrayImPares,Collections.reverseOrder());
        arrayResultado.addAll(arrayImPares);
        
  

        for (Integer value : arrayResultado) {
            System.out.println(value);
            
        }

    }

}
