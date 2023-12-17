package Lista100Ex;
import java.util.Scanner;

public class Ex107 {
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

        int produtoDiagonalSecundaria = calcularProdutoDiagonalSecundaria(matriz);

        System.out.println("O produto dos elementos da diagonal secundária é: " + produtoDiagonalSecundaria);

        scanner.close();
    }

    private static int calcularProdutoDiagonalSecundaria(int[][] matriz) {
        int produto = 1;

        for (int i = 0; i < 3; i++) {
            produto *= matriz[i][2 - i];
        }

        return produto;
    }
}
