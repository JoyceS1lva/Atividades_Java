package Lista100Ex;

import java.util.Scanner;

public class Ex80 {
    public static void main(String[] args) {
        String nome;
        int idade, quantid = 0, somaid = 0;

        Scanner valor = new Scanner(System.in);

        System.out.print("Digite seu nome : ");
        nome = valor.next();

        if(!nome.equals("fim")){
            quantid += 1;
        }

        for(String fim; !nome.equals("fim");){
            System.out.print("Idade : ");
            idade = valor.nextInt();

            somaid += idade;

            System.out.print("Digite seu nome : ");
            nome = valor.next();

        }

        System.out.print("A média das idades informadas é de : " + somaid);
    }
}
