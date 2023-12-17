package Lista100Ex;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        float n1, n2, n3;

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite 3 números e veja sua média aritmética");
        System.out.print("Número 1 : ");
        n1 = valor.nextFloat();

        System.out.print("Número 2 : ");
        n2 = valor.nextFloat();

        System.out.print("Número 3 : ");
        n3 = valor.nextFloat();

        System.out.print("A média aritmética destes 3 números é igual a : " + (n1 + n2 + n3) / 3);
    }
}
