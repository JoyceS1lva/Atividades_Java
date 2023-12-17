package Lista100Ex;
import java.util.Scanner;

public class Ex89 {
    public static void main(String[] args) {
        int[] num = new int[5];
        int n1;
        int quantpar = 0, quantimp = 0;

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite 5 números e veja o maior e menor deles");

        for (int i = 0; i < 5; i++) {
            System.out.printf("Número %d : ", i + 1);
            n1 = valor.nextInt();

            num[i] = n1;
        }

        for(int i : num){
            if(i % 2 == 0){
                quantpar += 1;
            }
            else{
                quantimp += 1;
            }
        }

        System.out.println("A quantidade de números pares digitados foi de : " + quantpar);
        System.out.println("A quantidade de números pares digitados foi de : " + quantimp);
    }
}