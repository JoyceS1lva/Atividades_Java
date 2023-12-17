package Lista100Ex;

import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        double salmin, salfunc;

        Scanner valor = new Scanner(System.in);

        System.out.print("Salário mínimo : R$");
        salmin = valor.nextFloat();

        System.out.print("Salário do funcionário : R$");
        salfunc = valor.nextFloat();

        System.out.printf("Este funcionário recebe %.1f salários mínimos", salfunc / salmin);
    }
}
