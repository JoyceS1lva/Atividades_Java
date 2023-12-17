package Lista100Ex;

import java.util.Scanner;

public class Ex44 {
    public static void main(String[] args) {
        String nome;
        int idade, i = 0, soma = 0;

        Scanner valor = new Scanner(System.in);

        while (i < 5){
            System.out.print("Nome : ");
            nome = valor.next();

            System.out.print("idade : ");
            idade = valor.nextInt();

            soma += idade;

            i += 1;
        }

        System.out.print("A média das idades inseridas foi de : " + soma / 5);
    }
}
