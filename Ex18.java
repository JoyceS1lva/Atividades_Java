package Lista100Ex;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        int n1, n2;

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite dois números e veja o maior entre eles");
        System.out.print("Primeiro número : ");
        n1 = valor.nextInt();

        System.out.print("Segundo número : ");
        n2 = valor.nextInt();

        if (n1 > n2){
            System.out.printf("O número %d é maior que o número %d",n1, n2);
        }
        else{
            System.out.printf("O número %d é maior que o número %d",n2, n1);
        }
    }
}
