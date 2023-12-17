
package Lista100Ex;
import java.util.Scanner;

public class Ex108 {
    public static void main(String[] args){
        int[][] matriz = new int[4][4];
        int num, maior1 = 0, maior2 = 0, maior3 = 0, maior4 = 0, quant = 1;

        Scanner valor = new Scanner(System.in);

        System.out.print("Insira os valores de uma matriz 4x4 : ");

        for(int i = 0; i < 4; i ++){
            quant = 1;
            for(int c = 0; c < 4; c ++){
                System.out.printf("Valor [%d][%d] : ", i, c);
                matriz[i][c] = valor.nextInt();

                if(i == 0) {
                    if (quant == 1) {
                        maior1 = matriz[i][c];
                    } else {
                        if (matriz[i][c] > maior1) {
                            maior1 = matriz[i][c];
                        }
                    }
                }
                if(i == 1) {
                    if (quant == 1) {
                        maior2 = matriz[i][c];
                    } else {
                        if (matriz[i][c] > maior2) {
                            maior2 = matriz[i][c];
                        }
                    }
                }
                if(i == 2) {
                    if (quant == 1) {
                        maior3 = matriz[i][c];
                    } else {
                        if (matriz[i][c] > maior3) {
                            maior3 = matriz[i][c];
                        }
                    }
                }
                if(i == 3) {
                    if (quant == 1) {
                        maior4 = matriz[i][c];
                    } else {
                        if (matriz[i][c] > maior4) {
                            maior4 = matriz[i][c];
                        }
                    }
                }

                quant += 1;
            }
        }
        System.out.print("O maior número da linha 1 é : " + maior1);
        System.out.print("O maior número da linha 2 é : " + maior2);
        System.out.print("O maior número da linha 3 é : " + maior3);
        System.out.print("O maior número da linha 4 é : " + maior4);
    }
}
