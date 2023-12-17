package Lista100Ex;
import java.util.Scanner;

public class Ex90 {
    public static void main(String[] args) {
        int[] num = new int[5];
        int n1;

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite 5 números e veja o maior e menor deles");

        for (int i = 0; i < 5; i++) {
            System.out.printf("Número %d : ", i + 1);
            n1 = valor.nextInt();

            num[i] = n1;
        }

        int quant = 1;

        for(int i: num){
            if(i == 0){
                System.out.printf("O número %d é igual a 0", quant);
            }
            quant += 1;
        }
    }
}