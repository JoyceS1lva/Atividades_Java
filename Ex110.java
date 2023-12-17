package Lista100Ex;
import java.util.Scanner;

public class Ex110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os elementos da primeira matriz 2x2:");
        int[][] matriz1 = lerMatriz(scanner, 2, 2);

        System.out.println("Digite os elementos da segunda matriz 2x2:");
        int[][] matriz2 = lerMatriz(scanner, 2, 2);

        int[][] resultado = subtrairMatrizes(matriz1, matriz2);

        System.out.println("Resultado da subtração das matrizes:");
        exibirMatriz(resultado);

        scanner.close();
    }

    private static int[][] lerMatriz(Scanner scanner, int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Elemento na posição (%d, %d): ", i + 1, j + 1);
                matriz[i][j] = scanner.nextInt();
            }
        }
        return matriz;
    }
    private static int[][] subtrairMatrizes(int[][] matriz1, int[][] matriz2) {
        int linhas = matriz1.length;
        int colunas = matriz1[0].length;
        int[][] resultado = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }

        return resultado;
    }

    private static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
