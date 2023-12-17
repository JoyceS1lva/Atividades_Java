package Lista100Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {
        int num, n1, n2;

        Scanner valor = new Scanner(System.in);

        System.out.print("Digite um número inteiro e veja seus dígitos em ordem crescente: ");
        num = valor.nextInt();

        ArrayList<Integer> cresc = new ArrayList<>();

        while (num > 0) {
            n1 = num % 10;
            num = num / 10;

            cresc.add(n1);
        }

        // Ordenar o ArrayList em ordem crescente
        Integer[] arrayCresc = cresc.toArray(new Integer[0]);
        Arrays.sort(arrayCresc);

        // Exibir os dígitos em ordem crescente
        System.out.print("Dígitos em ordem crescente: ");
        for (int i : arrayCresc) {
            System.out.print(i + " ");
        }
    }
}
