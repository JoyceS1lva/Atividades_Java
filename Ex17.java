package Lista100Ex;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        int idade;

        Scanner valor = new Scanner(System.in);

        System.out.print("Digite a idade e veja a faixa etária : ");
        idade = valor.nextInt();

        if (idade < 12){
            System.out.print("Criança");
        }
        else if (idade < 18){
            System.out.print("Adolescente");
        }
        else if (idade >= 18 && idade <= 59){
            System.out.print("Adulto");
        }
        else if( idade > 59){
            System.out.print("Idoso");
        }
    }
}
