package Lista100Ex;

import java.util.*;

public class Ex78 {
    public static void main(String[] args) {
        int num = 0, n1, n2;

        Scanner valor = new Scanner(System.in);

        System.out.print("Digite um número inteiro e veja seus dígitos em ordem crescente: ");
        num = valor.nextInt();

        ArrayList<Integer> cresc = new ArrayList<>();

        while (num > 0) {
            n1 = num % 10;
            num = num / 10;

            cresc.add(n1);
        }

        Collections.reverse(cresc);

        System.out.print("Dígitos em ordem crescente: ");
        for (int i : cresc) {
            System.out.print(i + " ");
        }
    }
}
