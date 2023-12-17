package Lista100Ex;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        float n1, n2, n3;

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite as 3 notas do aluno e veja se ele foi aprovado");
        System.out.print("Nota 1 : ");
        n1 = valor.nextFloat();

        System.out.print("Nota 2 : ");
        n2 = valor.nextFloat();

        System.out.print("Nota 3 : ");
        n3 = valor.nextFloat();

        float media = (n1 + n2 + n3) / 3;

        if (media >= 7) {
            System.out.print("Aprovado");
        }
    }
}
