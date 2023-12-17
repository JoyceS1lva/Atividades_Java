package Lista100Ex;
import java.util.Scanner;

public class Ex69 {
    public static void main(String[] args) {
        int num, soma = 0;

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite 5 números inteiros e veja sua média");

        for(int i = 1; i <= 5; i++){
            System.out.print("Número " + i + " : ");
            num = valor.nextInt();

            soma += num;
        }

        System.out.print("A média destes 5 valores é : " + (soma / 5));

    }
}
