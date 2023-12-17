
package Lista100Ex;
import java.util.Scanner;

public class Ex99 {
    public static void main(String[] args){
        int[][] matriz = new int[2][2];
        int num, soma = 0;

        Scanner valor = new Scanner(System.in);

        System.out.print("Insira os valores de uma matriz 2x2 : ");

        System.out.println("Matriz 1");

        for(int i = 0; i < 2; i ++){
            for(int c = 0; c < 2; c ++){
                System.out.printf("Valor [%d][%d] : ", i, c);
                matriz[i][c] = valor.nextInt();

                soma += matriz[i][c];
            }
        }

        System.out.println("Matriz 2");

        for(int i = 0; i < 2; i ++){
            for(int c = 0; c < 2; c ++){
                System.out.printf("Valor [%d][%d] : ", i, c);
                matriz[i][c] = valor.nextInt();

                soma += matriz[i][c];
            }
        }
        System.out.print(soma);

    }
}
