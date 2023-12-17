
package Lista100Ex;
import java.util.Scanner;

public class Ex105 {
    public static void main(String[] args){
        int[][] matriz = new int[4][4];
        int num, soma = 0, quant = 0, c1 = 0, c2 = 0, c3 = 0, c4 = 0;

        Scanner valor = new Scanner(System.in);

        System.out.print("Insira os valores de uma matriz 4x4 : ");

        for(int i = 0; i < 4; i ++){
            for(int c = 0; c < 4; c ++){
                System.out.printf("Valor [%d][%d] : ", i, c);
                matriz[i][c] = valor.nextInt();

                if (i == 0) {
                    c1 += matriz[i][c];
                }
                if (i == 1) {
                    c2 += matriz[i][c];
                }
                if (i == 2) {
                    c3 += matriz[i][c];
                }
                if (i == 3) {
                    c4 += matriz[i][c];
                }

            }
        }
        System.out.print(c1);
        System.out.print(c2);
        System.out.print(c3);
        System.out.print(c4);

    }
}
