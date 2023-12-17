package Lista100Ex;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        int num;

        Scanner valor = new Scanner(System.in);

        System.out.print("Digite um número inteiro : ");
        num = valor.nextInt();

        if (num % 2 == 0){
            System.out.println("Este número é PAR");
        }
        else{
            System.out.println("Este número é IMPAR");
        }
    }
}
