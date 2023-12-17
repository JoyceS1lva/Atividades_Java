package Lista100Ex;

import java.util.Scanner;

public class Ex65 {
    public static void main(String[] args) {
        String nome;
        int idade, somaid = 0, quantid = 0;

        Scanner valor = new Scanner(System.in);

        do{
            System.out.print("Digite seu nome : ");
            nome = valor.next();

            System.out.print("Idade : ");
            idade = valor.nextInt();

            somaid += idade;
            quantid += 1;
        }while(!nome.equals("fim"));

        System.out.print("A média das idades é de : " + (somaid / quantid));
    }
}
