
package Lista100Ex;
import java.util.Scanner;

public class Ex101 {
    public static void main(String[] args){
        int[][] matriz = new int[4][4];
        int num, soma = 0, quant = 0;

        Scanner valor = new Scanner(System.in);

        System.out.print("Insira os valores de uma matriz 4x4 : ");

        for(int i = 0; i < 4; i ++){
            for(int c = 0; c < 4; c ++){
                System.out.printf("Valor [%d][%d] : ", i, c);
                matriz[i][c] = valor.nextInt();

                soma += matriz[i][c];
                quant += 1;
            }
        }
        System.out.print(quant);
        System.out.print(soma);
        System.out.print("A média entre os valores digitados da matriz é de : " + (soma / quant));


    }
}
