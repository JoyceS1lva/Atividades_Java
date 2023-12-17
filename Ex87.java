package Lista100Ex;
import java.util.Scanner;

public class Ex87 {
    public static void main(String[] args) {
        int[] num = new int[10];
        int n1, quant = 0;

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite 10 valores e veja quais deles são positivos");

        for(int i = 0; i < 10; i ++){
            System.out.printf("Número %d : ", i + 1);
            n1 = valor.nextInt();

            num[i] = n1;
        }

        for(int i : num){
            if(i >= 0){
                quant += 1;
            }
        }

        System.out.print("A quantidade de números positivos digitados foi de : " + quant);
    }
}
