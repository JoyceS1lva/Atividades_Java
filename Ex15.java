package Lista100Ex;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        double sal;
        double aum;

        Scanner valor = new Scanner(System.in);

        System.out.print("Digite seu salário : R$");
        sal = valor.nextFloat();

        aum = (sal + ((sal * 15) / 100));

        System.out.printf("Com um aumento de %s seu salário passará a ser de : R$%.2f", "15%", aum);
    }
}
