package Lista100Ex;
import java.util.Scanner;

public class Ex74 {
    public static void main(String[] args){
        String nome;
        int idade, quantid = 0, somaid = 0;

        Scanner valor = new Scanner(System.in);

        for (int i = 1; i <= 5; i++){
            System.out.print("Digite seu nome : ");
            nome = valor.next();

            System.out.print("Idade : ");
            idade = valor.nextInt();

            somaid += idade;
            quantid += 1;
        }

        System.out.print("A média das idades fornecidas é de : " + (somaid / quantid));
    }
}
