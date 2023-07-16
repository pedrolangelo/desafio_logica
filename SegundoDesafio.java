import java.util.Scanner;

public class SegundoDesafio {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um valor monetário: ");
        double valor = ler.nextDouble();
        double valorRestante = valor;

        // Cada casa do vetor corresponde a uma nota ou moeda de 1 real
        // Ex: notas[0] é a quantidade de notas de cem, notas[1] é de cinquenta, assim por diante ate a de dois.
        int[] notas = new int[7];

        // A mesma coisa para as moedas, da maior para a menor, tirando a moeda de 1 real.
        int[] moedas = new int[5];

        // Começando a contagem das notas
        do
        {
            if (valorRestante/100 >= 1)
            {
                notas[0]++;
                valorRestante -= 100;

            } else if (valorRestante/50 >= 1)
            {
                notas[1]++;
                valorRestante -= 50;

            } else if (valorRestante/20 >= 1)
            {
                notas[2]++;
                valorRestante -= 20;

            } else if (valorRestante/10 >= 1)
            {
                notas[3]++;
                valorRestante -= 10;

            } else if (valorRestante/5 >= 1)
            {
                notas[4]++;
                valorRestante -= 5;

            } else if (valorRestante/2 >= 1)
            {
                notas[5]++;
                valorRestante -= 2;
            }else if (valorRestante/1 >= 1)
            {
                notas[6]++;
                valorRestante -= 1;
            }
        }while(valorRestante >= 1);

        for (int i = 0; i < notas.length; i++) 
        {
            System.out.print(notas[i]);

            switch (i) 
            {
                case 0:
                    System.out.println(" nota(s) de R$ 100.00");
                    break;
                case 1:
                    System.out.println(" nota(s) de R$ 50.00");
                    break;
                case 2:
                    System.out.println(" nota(s) de R$ 20.00");
                    break;
                case 3:
                    System.out.println(" nota(s) de R$ 10.00");
                    break;
                case 4:
                    System.out.println(" nota(s) de R$ 5.00");
                    break;
                case 5:
                    System.out.println(" nota(s) de R$ 2.00");
                    break;
                case 6:
                    System.out.println(" moeda(s) de R$ 1.00");
                    break;
            }
        }

        // Agora a parte das moedas
        valorRestante = valor - (int)valor;
        valorRestante *= 100;

        do
        {
            if (valorRestante/50 >= 1)
            {
                moedas[0]++;
                valorRestante -= 50;

            } else if (valorRestante/25 >= 1)
            {
                moedas[1]++;
                valorRestante -= 25;

            } else if (valorRestante/10 >= 1)
            {
                moedas[2]++;
                valorRestante -= 10;

            } else if (valorRestante/5 >= 1)
            {
                moedas[3]++;
                valorRestante -= 5;

            } else if (valorRestante/1 >= 1)
            {
                moedas[4]++;
                valorRestante -= 1;
            }
        }while(valorRestante >= 1);

        for (int i = 0; i < moedas.length; i++) 
        {
            System.out.print(moedas[i]);

            switch (i) 
            {
                case 0:
                    System.out.println(" moeda(s) de R$ 0.50");
                    break;
                case 1:
                    System.out.println(" moeda(s) de R$ 0.25");
                    break;
                case 2:
                    System.out.println(" moeda(s) de R$ 0.10");
                    break;
                case 3:
                    System.out.println(" moeda(s) de R$ 0.05");
                    break;
                case 4:
                    System.out.println(" moeda(s) de R$ 0.01");
                    break;
            }
        }
        ler.close();
    }
}
