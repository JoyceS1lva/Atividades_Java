package Lista100Ex;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        float nota;
        String nome;

        Scanner valor = new Scanner(System.in);

        System.out.print("Nome do aluno : ");
        nome = valor.next();

        System.out.print("Nota : ");
        nota = valor.nextFloat();

        if (nota >= 9 && nota <=10){
            System.out.print("Conceito A");
        }
        else if (nota < 9 && nota >= 7){
            System.out.print("Conceito B");
        }
        else if (nota < 7 && nota >= 5){
            System.out.print("Conceito C");
        }
        else if (nota < 5 && nota >=3){
            System.out.print("Conceito D");
        }
        else if (nota < 3 && nota >=0){
            System.out.print("Conceito E");
        }
    }
}
