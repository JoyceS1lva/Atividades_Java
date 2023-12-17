package Lista100Ex;

import java.util.Scanner;

public class Ex76 {
    public static void main(String[] args) {
        int num, soma = 0, somapar = 0;

        Scanner valor = new Scanner(System.in);

        System.out.print("Digite um número inteiro : ");
        num = valor.nextInt();

        for(int i = 0; i < num; i++){
            if (i % 2 == 0) {
                somapar += i;
            }
        }

        System.out.print("A soma dos números pares entre 1 e o número digitado foi de : " + somapar);
    }
}
