package Lista100Ex;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        int num;

        Scanner valor = new Scanner(System.in);

        System.out.print("Digite um número inteiro e veja se ele é PAR ou IMPAR : ");
        num = valor.nextInt();

        if (num % 2 == 0){
            System.out.print("Este número é PAR");
        }
        else{
            System.out.print("Este número é IMPAR");
        }
    }
}
