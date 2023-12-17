package Lista100Ex;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        float peso, alt;

        Scanner valor = new Scanner(System.in);

        System.out.println("Cálculo de IMC");
        System.out.print("Digite seu peso : (kg) ");
        peso = valor.nextFloat();

        System.out.print("Digite sua altura : (m) ");
        alt = valor.nextFloat();

        System.out.printf("Seu IMC está igual a : %.2f", (peso / (alt * alt)));
    }
}
