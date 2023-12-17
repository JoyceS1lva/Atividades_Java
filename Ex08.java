package Lista100Ex;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        int n1, n2;

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite dois números inteiros e veja a troca entre eles : ");

        System.out.print("Número 1 : ");
        n1 = valor.nextInt();

        System.out.print("Número 2 : ");
        n2 = valor.nextInt();

        System.out.println("-- Após a troca --");

        System.out.println("Número 1 : " + n2);
        System.out.println("Número 2 : " + n1);
    }
}
