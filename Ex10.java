package Lista100Ex;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        int n;

        Scanner valor = new Scanner(System.in);

        System.out.print("Digite um número inteiro e veja sua taboada : ");
        n = valor.nextInt();

        System.out.println(String.format("Taboada de %d", n));
        for (int i = 1; i < 11; i ++){
            System.out.println(String.format("%d x %d = %d", n, i, (n * i)));
        }
    }
}
