package desafio2;

import java.util.Locale;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);
       System.out.println("Informe o valor");
        float valorDeEntrada = scan.nextFloat();
        scan.close();

        int notas[] = new int[6];   
            notas[0]  =   (int) (valorDeEntrada / 100);
            notas[1]  = (int) ( (valorDeEntrada - (notas[0] * 100)) / 50);
            notas[2]   = (int) ( (valorDeEntrada - (notas[1] * 50)- (notas[0] * 100)) / 20);
            notas[3]   = (int) ( (valorDeEntrada - (notas[2] * 20) - (notas[1]  * 50)- (notas[0] * 100)) / 10);
            notas[4]   = (int) ( (valorDeEntrada - (notas[3] * 10) - (notas[2] * 20) - (notas[1]  * 50)- (notas[0] * 100))  / 5);
            notas[5]  = (int) ( (valorDeEntrada - (notas[4] * 5) -(notas[3] * 10) - (notas[2] * 20) - (notas[1]  * 50)- (notas[0] * 100)) / 2);
            float[] valores = {100f,50f,20f,10f,5f,2f};

        int moedas[] = new int[6];   
            float valorEntradaMoeda = (valorDeEntrada - (int) valorDeEntrada);
            float valorArredondado = Math.round(valorDeEntrada * (float) Math.pow(10, 2)) / (float) Math.pow(10, 2);
            float parteDecimal = valorArredondado - (int) valorArredondado;

            System.out.println(parteDecimal);
            moedas[0]  =  (int) ( (valorDeEntrada - (notas[5] * 2) -(notas[4] * 5) -(notas[3] * 10) - (notas[2] * 20) - (notas[1]  * 50)- (notas[0] * 100)));
            moedas[1]  = (int) ( (valorEntradaMoeda - (moedas[0] * 100)) / 50);
            moedas[2]   = (int) ( (valorEntradaMoeda - (moedas[1] * 50)- (moedas[0] * 100)) / 25);
            moedas[3]   = (int) ( (valorEntradaMoeda - (moedas[2] * 20) - (moedas[1]  * 50)- (moedas[0] * 100)) / 10);
            moedas[4]   = (int) ( (valorEntradaMoeda - (moedas[3] * 10) - (moedas[2] * 20) - (moedas[1]  * 50)- (moedas[0] * 100))  / 5);
            moedas[5]  = (int) ( (valorEntradaMoeda - (moedas[4] * 5) -(moedas[3] * 10) - (moedas[2] * 20) - (moedas[1]  * 50)- (moedas[0] * 100)));
            float[] valoresMoedas = {1f,0.50f,0.25f,0.10f,0.5f,0.1f};
           
      

     System.out.println("NOTAS : ");     
    for (int i = 0; i < notas.length; i++) {
        System.out.printf("%d nota(s) de R$ %.2f%n", notas[i], valores[i]);
    }

         System.out.println("MOEDAS : ");     
    for (int i = 0; i < moedas.length; i++) {
        System.out.printf("%d nota(s) de R$ %.2f%n", moedas[i], valoresMoedas[i]);
    }
        
    }
    
}
