package Lista100Ex;

import java.util.Scanner;

public class Ex70 {
    public static void main(String[] args) {
        int num;

        Scanner valor = new Scanner(System.in);

        System.out.print("Digite um número inteiro e veja sua taboada : ");
        num = valor.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(String.format("%d x %d = %d", num, i, (num * i)));
        }
    }
}
