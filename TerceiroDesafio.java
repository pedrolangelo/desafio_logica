import java.util.Scanner;

public class TerceiroDesafio {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Lendo o valor alvo
        System.out.println("Digite k: ");
        int alvo = ler.nextInt();

        // Lendo tamanho N do array
        System.out.println("Tamanho do array: ");
        int tamanho = ler.nextInt();
        
        int[] entrada = new int[tamanho];
        int x = 0;

        // Lendo N valores inteiros
        for (int i = 0; i < tamanho; i++)
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

        // Verificando quais diferenças satisfazem o o criterio
        int saida = 0;
        for (int i = 0; i < tamanho; i++)
        {
            for(int j = 0; j < tamanho; j++){
                if(entrada[i] - entrada[j] == alvo) {
                    saida++;
                }
            }
        }
        System.out.println("Saída: " + saida);
        ler.close();
    }
}