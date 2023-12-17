package Lista100Ex;

import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        int n1, n2, n3, media;

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite 3 números inteiros e veja a média aritmética entre eles");

        System.out.print("Número 1 : ");
        n1 = valor.nextInt();

        System.out.print("Número 2 : ");
        n2 = valor.nextInt();

        System.out.print("Número 3 : ");
        n3 = valor.nextInt();

        media = (n1 + n2 + n3) / 3;

        System.out.printf("A média entre os 3 números é de : %d \n", media);

        if (media >= 7){
            System.out.print("Aprovado");
        }
        else{
            System.out.print("Reprovado");
        }
    }
}
