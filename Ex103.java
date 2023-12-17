
package Lista100Ex;
import java.util.Scanner;

public class Ex103 {
    public static void main(String[] args){
        int[][] matriz = new int[3][3];
        int num, menor = 0, quant = 1;

        Scanner valor = new Scanner(System.in);

        System.out.print("Insira os valores de uma matriz 3x3 : ");

        for(int i = 0; i < 3; i ++){
            for(int c = 0; c < 3; c ++){
                System.out.printf("Valor [%d][%d] : ", i, c);
                matriz[i][c] = valor.nextInt();

                if(quant == 1){
                    menor = matriz[i][c];
                }
                else{
                    if(matriz[i][c] < menor){
                        menor = matriz[i][c];
                    }
                }

                quant += 1;
            }
        }
        System.out.print("O menor número da matriz é : " + menor);

    }
}
