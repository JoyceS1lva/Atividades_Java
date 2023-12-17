package Lista100Ex;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        float salb, salli = 0;

        Scanner valor = new Scanner(System.in);

        System.out.print("Digite seu salário base : R$");
        salb = valor.nextFloat();
        salli = (salb + ((salb * 5) / 100));

        System.out.printf("Com comissão de %s seu salário será de : R$%.2f", "5%", salli);
    }
}
