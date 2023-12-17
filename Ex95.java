package Lista100Ex;
import java.util.Arrays;
import java.util.Scanner;

public class Ex95 {
    public static void main(String[] args) {
        String[] nomes = new String[5];

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite 5 nomes e veja eles em ordem alfabética.");

        for (int i = 0; i < 5; i++) {
            System.out.printf("Nome %d : ", i + 1);
            nomes[i] = valor.next();
        }

        Arrays.sort(nomes);

        for( String nome : nomes){
            System.out.print(nome + " ");
        }
    }
}