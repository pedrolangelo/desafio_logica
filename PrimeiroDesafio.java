import java.util.Arrays;
import java.util.Scanner;

public class PrimeiroDesafio{
    public static void main(String[] args) {
        // --------------------------------------------------------------------
        //     Valores para teste
        //     int linhas = 10;
        //     int[] entrada = {4, 32 , 34, 543, 3456, 654, 567, 87, 6789, 98};
        // --------------------------------------------------------------------

        Scanner ler = new Scanner(System.in);

        // Lendo primeiro valor de entrada para determinar quantidade de linhas
        System.out.println("Digite N: ");
        int linhas = ler.nextInt();
        
        int[] entrada = new int[linhas];
        int x = 0;

        // Lendo N valores inteiros
        for (int i = 0; i < linhas; i++)
        {
            do
            {
                System.out.println((i+1) + "° valor inteiro positivo: ");
                x = ler.nextInt();
                if(x>0){
                    entrada[i] = x;
                }else System.out.println("N tem que ser positivo. ");
            }while (x <= 0);
        }

        // Criei dois vetores para separar os numeros impares dos pares
        int[] vetorPar = new int[linhas];
        int[] vetorImpar = new int[linhas];

        // Tambem criei um contador auxiliar pra cada, para evitar fazer muitos for (apesar de ainda ter bastante)
        int auxPar = 0;
        int auxImpar = 0;

        // Primeiro for para separar os valores nos seus respectivos vetores
        for (int i = 0; i < linhas; i++)
        {
            if (entrada[i] % 2 == 0)
            {
                vetorPar[auxPar] = entrada[i];
                auxPar++;
            } else 
            {
                vetorImpar[auxImpar] = entrada[i];
                auxImpar++;
            }
        }

        System.out.println("----------------------------");

        // Aqui eu ordeno os valores pares e printo na tela, usei a biblioteca Arrays para a ordenação
        Arrays.sort(vetorPar);

        for (int i = 0; i < linhas; i++)
        {
            if (vetorPar[i] != 0) 
            {
                System.out.println(vetorPar[i]);
            }
        }

        // E aqui eu tambem ordeno os valores impares, porem printo o vetor ao contrario ja que a ordem é ecrescente
        Arrays.sort(vetorImpar);

        for (int i = linhas - 1; i > 0; i--)
        {
            if (vetorImpar[i] != 0) 
            {
                System.out.println(vetorImpar[i]);
            }
        }

        ler.close();
    }
}