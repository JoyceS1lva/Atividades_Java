package Lista100Ex;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        float n1, n2, n3, p1, p2, p3;

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite suas notas");

        System.out.print("Nota 1 : ");
        n1 = valor.nextFloat();

        System.out.print("Nota 2 : ");
        n2 = valor.nextFloat();

        System.out.print("Nota 3 : ");
        n3 = valor.nextFloat();

        float somanota = ((n1 * 2) + (n2 * 3) + (n3 * 5));

        System.out.println("A média ponderada é igual a = " + somanota / (10));
    }
}
