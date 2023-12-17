package Lista100Ex;
import java.util.Scanner;

public class Ex50 {
    public static void main(String[] args) {
        String nome, opc;
        int idade, quantid = 0, soma = 0;

        Scanner valor = new Scanner(System.in);

        while (true){
            System.out.print("Digite seu nome : ");
            nome = valor.next();

            System.out.print("Idade : ");
            idade = valor.nextInt();

            System.out.print("Para finalizar digite 'fim' : ");
            opc = valor.next().toLowerCase();

            soma += idade;
            quantid += 1;

            if (opc.equals("fim")){
                break;
            }
        }

        System.out.print("A média das idades informadas é igual a : " + (soma / quantid));
    }
}
