package Lista100Ex;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        double sal, aum;

        Scanner valor = new Scanner(System.in);

        System.out.print("Digite seu salário : R$");
        sal = valor.nextFloat();

        if (sal < 2000){
            aum = (sal * 5 / 100);
            System.out.printf("Seu salário com um aumento de %s passará a ser de : R$%.2f","5%" , sal + aum);
        }
        else{
            aum = (sal * 10 / 100);
            System.out.printf("Seu salário com um aumento de %s passará a ser de : R$%.2f","5%" , sal + aum);
        }


    }
}
