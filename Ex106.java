
package Lista100Ex;
import java.util.Scanner;

public class Ex106 {
    public static void main(String[] args){
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int num, soma = 0, igual = 0;

        Scanner valor = new Scanner(System.in);

        System.out.print("Insira os valores de uma matriz 2x2 : ");

        System.out.println("Matriz 1");

        for(int i = 0; i < 2; i ++){
            for(int c = 0; c < 2; c ++){
                System.out.printf("Valor [%d][%d] : ", i, c);
                matriz1[i][c] = valor.nextInt();

                soma += matriz1[i][c];
            }
        }

        System.out.println("Matriz 2");

        for(int i = 0; i < 2; i ++){
            for(int c = 0; c < 2; c ++){
                System.out.printf("Valor [%d][%d] : ", i, c);
                matriz2[i][c] = valor.nextInt();

                soma += matriz2[i][c];
            }
        }

        for(int i = 0; i < 2; i++){
            for(int c = 0; c < 2; c++){
                if(matriz1[i][c] == matriz2[i][c]){
                    igual = 1;
                    System.out.print("è igual");
                }
                else{
                    igual = 2;
                    break;
                }
            }
        }
        if(igual == 1){
            System.out.print("As matrizes são iguais");
        }
        else{
            System.out.print("As matrizes não são iguais");
        }
    }
}
