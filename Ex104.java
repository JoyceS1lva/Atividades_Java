package Lista100Ex;
import java.util.Scanner;

public class Ex104 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de linhas/colunas da matriz:");
        int n = scanner.nextInt();
        int[][] matriz = lerMatriz(scanner, n, n);

        boolean simetrica = verificarSimetria(matriz);

        if (simetrica) {
            System.out.println("A matriz é simétrica.");
        } else {
            System.out.println("A matriz não é simétrica.");
        }

        scanner.close();
    }

    private static int[][] lerMatriz(Scanner scanner, int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Elemento na posição (%d, %d): ", i + 1, j + 1);
                matriz[i][j] = scanner.nextInt();
            }
        }
        return matriz;
    }

    private static boolean verificarSimetria(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        if (linhas != colunas) {
            return false;
        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }
}
