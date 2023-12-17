package Lista100Ex;

import java.util.Scanner;

public class Ex79 {
    public static void main(String[] args) {
        int num, f;

        Scanner valor = new Scanner(System.in);

        System.out.print("Digite um número inteiro e veja seu fatorial : ");
        num = valor.nextInt();

        f = num;
        num -= 1;

    System.out.print("!" + f + " = " + f + " x ");

        for(int i = num; i > 0;){

            if(i > 1){
                System.out.print(i + " x ");
            }
            else if(i == 1){
                System.out.print(i + " = ");
            }

            f = f * (num);
            num -= 1;

            i -= 1;

        }

        System.out.print(f);
    }
}
