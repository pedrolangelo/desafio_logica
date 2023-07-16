import java.util.Scanner;

public class QuartoDesafio {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // --------------------------------------------------------------------
        //     Frases para teste
        //     int teste = 5;
        //     String[] saida = new String[teste];        
        //     String[] entrada = {"I ENIL SIHTHSIREBBIG S", "LEVELKAYAK", "H YPPAHSYADILO", "ABCDEFGHIJKLMNOPQRSTUVWXYZ", "VOD OWT SNEH HCNERF EGDIRTRAP A DNA SE"};
        // --------------------------------------------------------------------

        char caractere; // Vou usar essa variavel para colocar o caractere no lugar certo
        boolean maiuscula;

        // Lendo quantidade de casos para teste
        System.out.print("Digite N: ");
        int teste = ler.nextInt();
        
        String[] entrada = new String[teste];
        String[] saida = new String[teste];
        String x = ler.nextLine(); // Consumir a quebra de linha pendente;

        // Lendo N valores inteiros
        for (int i = 0; i < teste; i++)
        {
            do
            {
                System.out.println((i+1) + "° frase para teste: ");
                x = ler.nextLine();
                maiuscula = verificaMaiuscula(x);
                if(x.length() >= 2 && x.length() <= 100 && maiuscula){
                    entrada[i] = x;
                }else System.out.println("A frase com no minimo 2 e no maximo 100 caracteres de letras maiusculas e espaços. ");
            }while (x.length() < 2 || x.length() > 100 || !maiuscula);
        }

        for (int i = 0; i < teste; i++) 
        {
            StringBuilder builder = new StringBuilder(); // O builder é pra concatenar caractere por caractere na ordem certa

            // Primeira metade da palavra
            int metadeDaPalavra = entrada[i].length()/2;
            for (int j = metadeDaPalavra - 1; j > 0; j--) 
            {
                caractere = entrada[i].charAt(j);
                builder.append(caractere);
            }

            caractere = entrada[i].charAt(0);
            builder.append(caractere);

            // Segunda metade da palavra
            for (int j = entrada[i].length(); j > metadeDaPalavra; j--) 
            {
                caractere = entrada[i].charAt(j - 1);
                builder.append(caractere);
            }
            saida[i] = builder.toString().trim();
        }

        for (int i = 0; i < teste; i++) 
        {
            System.out.println((i+1) + "° frase convertida: " + saida[i]);
        }
        ler.close();

    }

    public static boolean verificaMaiuscula(String frase) {
        for (int i = 0; i < frase.length(); i++) 
        {
            char caractere = frase.charAt(i);
            if (caractere != ' ' && !Character.isUpperCase(caractere)) 
            {
                return false;
            }
        }
        return true;
    }
}
