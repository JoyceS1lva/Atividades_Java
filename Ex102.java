
package Lista100Ex;
import java.util.Scanner;

public class Ex102 {
    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);

        int linha = 2;
        int coluna = 2;
        int[][] matrizA = new int[linha][coluna];
        int linha2 = 2;
        int coluna2 = 2;
        int[][] matrizB = new int[linha2][coluna2];

        for (int i = 0; i < linha; i++) {
            for(int j = 0; j < coluna; j++){
                System.out.print("Digite um valor da MatrizA : ");
                matrizA[i][j] = valor.nextInt();
            }
        }

        for (int i = 0; i < linha2; i++) {
            for(int j = 0; j < coluna2; j++){
                System.out.print("Digite um valor da MatrizB : ");
                matrizB[i][j] = valor.nextInt();
            }
        }

        for (int i = 0; i < linha; i++) {
            for(int j = 0; j < coluna; j++){
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.print("");
        }

        for (int i = 0; i < linha2; i++) {
            for(int j = 0; j < coluna2; j++){
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.print("");
        }

        if(matrizA[0].length == matrizB.length){
            int[][] matrizC = new int[linha][coluna2];

            for(int i = 0; i < linha; i++){
                for(int j = 0; j < coluna2; j++){
                    for (int k = 0; k < linha; k ++){
                        matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                    }
                }
            }

            for (int i = 0; i < linha; i++) {
                for(int j = 0; j < coluna2; j++){
                    System.out.print(matrizC[i][j] + " ");
                }
                System.out.print("");
            }
        }
    }
}