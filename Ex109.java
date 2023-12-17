package Lista100Ex;
import java.util.Scanner;

public class Ex109 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os elementos da matriz 3x3:");

        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Elemento na posição (%d, %d): ", i + 1, j + 1);
                matriz[i][j] = scanner.nextInt();
            }
        }

        boolean eMatrizIdentidade = verificarMatrizIdentidade(matriz);

        if (eMatrizIdentidade) {
            System.out.println("A matriz é uma matriz identidade.");
        } else {
            System.out.println("A matriz não é uma matriz identidade.");
        }

        scanner.close();
    }

    private static boolean verificarMatrizIdentidade(int[][] matriz) {
        if (matriz.length != 3 || matriz[0].length != 3) {
            return false;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i == j && matriz[i][j] != 1) || (i != j && matriz[i][j] != 0)) {
                    return false;
                }
            }
        }

        return true;
    }
}
