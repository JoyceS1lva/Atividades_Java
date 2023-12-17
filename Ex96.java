
package Lista100Ex;
import java.util.Scanner;

public class Ex96 {
    public static void main(String[] args){
        int[][] matriz = new int[3][3];
        int num, quant = 0;

        Scanner valor = new Scanner(System.in);

        System.out.print("Insira os valores de uma matriz 3x3 : ");

        for(int i = 0; i < 3; i ++){
            for(int c = 0; c < 3; c ++){
                System.out.printf("Valor [%d][%d] : ", i, c);
                matriz[i][c] = valor.nextInt();
            }
        }

        for (int i = 0; i < 3; i++){
            for(int c = 0; c < 3; c ++){
                System.out.printf("[%d]", matriz[i][c]);
            }
            System.out.println("\n");
        }
    }
}
