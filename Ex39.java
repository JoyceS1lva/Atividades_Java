package Lista100Ex;

import java.util.Scanner;

public class Ex39 {
    public static void main(String[] args) {
        int num, i = 1, soma = 0, cont = 0;
        float media;

        Scanner valor = new Scanner(System.in);

        while (i < 6){
            System.out.printf("Número %d : ", i);
            num = valor.nextInt();

            i += 1;

            soma += num;
            cont += 1;

            if (i == 6){
                break;
            }
        }
        System.out.print("A média aritmética entre os 5 valores é de : " + soma / cont);
    }
}
