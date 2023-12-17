package Lista100Ex;
import java.util.Scanner;

public class Ex93 {
    public static void main(String[] args) {
        int[] num = new int[10];
        int n1, somaposi = 0, somaneg = 0, quant = 1;

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite 10 números e veja se estão entre 10 e 50");

        for (int i = 0; i < 10; i++) {
            System.out.printf("Número %d : ", i + 1);
            n1 = valor.nextInt();

            num[i] = n1;
        }

        for(int i : num){
            if(i > 10 && i < 50){
                System.out.println(String.format("Número %d = %d", quant, i));
            }

            quant += 1;
        }

    }
}