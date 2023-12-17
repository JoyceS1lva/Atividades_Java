package Lista100Ex;

import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        String nome;
        int idade;

        Scanner valor = new Scanner(System.in);

        System.out.println("Verifique seu status de voto");

        System.out.print("Nome : ");
        nome = valor.next();

        System.out.print("Idade : ");
        idade = valor.nextInt();

        if (idade >= 18 && idade < 70){
            System.out.print("Voto obrigatório.");
        }
        else if (idade >= 16 && idade < 18 || idade >= 70){
            System.out.print("Voto opcional.");
        }
        else{
            System.out.print("Inapto ao voto.");
        }
    }
}
