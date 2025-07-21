import java.util.Scanner;

public class ContagemParImpar {
    /**
     * Programa que lê 10 números inteiros e conta quantos são pares e quantos são
     * ímpares,
     * exibindo os números separados em duas listas.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        int[] pares = new int[10]; // Array para armazenar números pares
        int[] impares = new int[10]; // Array para armazenar números ímpares
        int contPar = 0, contImpar = 0; // Contadores de pares e ímpares

        // Entrada de dados
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        // Processamento
        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                pares[contPar] = numeros[i]; // Armazena o número par
                contPar++;
            } else {
                impares[contImpar] = numeros[i]; // Armazena o número ímpar
                contImpar++;
            }
        }

        // Exibição dos resultados
        System.out.println("Quantidade de números pares: " + contPar);
        System.out.print("Números pares: ");
        for (int i = 0; i < contPar; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.println("\nQuantidade de números ímpares: " + contImpar);
        System.out.print("Números ímpares: ");
        for (int i = 0; i < contImpar; i++) {
            System.out.print(impares[i] + " ");
        }

        sc.close(); // Fechar o scanner
    }
}