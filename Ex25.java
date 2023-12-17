package Lista100Ex;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        int faltas;

        Scanner valor = new Scanner(System.in);

        System.out.println("Calculadora de faltas do aluno");

        System.out.print("Digite quantas faltas você possui na matéria : ");
        faltas = valor.nextInt();

        System.out.println("Total de faltas : " + faltas);

        if (faltas > 15){
            System.out.print("Você está reprovado");
        }
    }
}
