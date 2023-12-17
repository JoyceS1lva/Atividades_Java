package Lista100Ex;

import java.util.Scanner;

public class Ex64 {
    public static void main(String[] args) {
        int num,c = 0, f;

        Scanner valor = new Scanner(System.in);

        System.out.print("Digite um número inteiro e veja seu fatorial : ");
        num = valor.nextInt();

        c = num - 1;
        f = num;

        do{
            f *= c;
            c -= 1;

        }while(c > 0);

        System.out.print(f);
    }
}
