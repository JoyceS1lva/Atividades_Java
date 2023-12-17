package Lista100Ex;

import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        String nome;
        float nota;

        Scanner valor = new Scanner(System.in);

        System.out.print("Nome do aluno : ");
        nome = valor.next();

        System.out.print("Nota : ");
        nota = valor.nextFloat();

        if (nota >= 7){
            System.out.printf("Parabéns %s, você está aprovado", nome);
        }
        else{
            System.out.printf("Sinto muito %s, você está de recuperação", nome);
        }
    }
}
