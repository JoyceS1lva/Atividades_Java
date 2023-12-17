package Lista100Ex;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        int n1, n2, mult;

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite dois números e veja se um é multiplo do outro");

        System.out.print("Primeiro número : ");
        n1 = valor.nextInt();

        System.out.print("Segundo número : ");
        n2 = valor.nextInt();

        mult = n1 / n2;

        if (mult * n2 == n1){
            System.out.printf("O número %d é múltiplo de %d", n1, n2);
        }
        else{
            System.out.printf("O número %d não é múltiplo de %d", n1, n2);
        }
    }
}
