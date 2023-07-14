
/**
 * Desafio 4
 
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
        //  String linhaErrada = "Linha Errada:";
        //  String linhaCorreta1 = "Linha Correta";
        //   System.out.printf("%s  ---  %s", linhaErrada, linhaCorreta1);
          System.out.println("\nLinhas Corretas");
         for (String string : arrayStrings) {
           String linhaCorreta =  desembaralhaLinhas(string);

          // System.out.printf("%s  ---  %s%n", string, linhaCorreta);
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
