package Lista100Ex;

import java.util.Scanner;

public class Ex45 {
    public static void main(String[] args) {
        int num, n1 = 0, n2 = 1, n3 = 1, p20 = 2, i = 0;

        Scanner valor = new Scanner(System.in);

        System.out.println("Sequência de Fibonacci");

        System.out.printf("%d - %d - ", n1, n2);

        while (i < 8){
            System.out.printf("%d - ", n3);
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
            i += 1;

            p20 += 1;
        }
    }
}
