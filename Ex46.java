package Lista100Ex;

import java.util.Scanner;

public class Ex46 {
    public static void main(String[] args) {
        int num, i = 1, somapar = 0;

        Scanner valor = new Scanner(System.in);

        System.out.print("Digite um número inteiro : ");
        num = valor.nextInt();

        while (i < num){
            if (i % 2 == 0){
                somapar += i;
            }
            i += 1;
        }

        System.out.printf("A soma de todos os números pares entre 1 e %d é igual a %d", num, somapar );
    }
}
