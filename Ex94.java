package Lista100Ex;
import java.util.Scanner;

public class Ex94 {
    public static void main(String[] args) {
        int[] num = new int[7];
        int n1;

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite 7 números e veja quais são pares");

        for (int i = 0; i < 7; i++) {
            System.out.printf("Número %d : ", i + 1);
            n1 = valor.nextInt();

            num[i] = n1;
        }

        System.out.print("São pares os números : ");

        for(int i : num){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }

    }
}