package Lista100Ex;
import java.util.Scanner;

public class Ex83 {
    public static void main(String[] args) {
        int[] num = new int[7];
        int n1, somaid = 0;

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite 7 números e veja a média entre eles");

        for(int i = 0; i < 7; i ++){
            System.out.printf("Número %d : ", i + 1);
            n1 = valor.nextInt();

            num[i] = n1;

            somaid += n1;
        }

        System.out.print("A média entre os valores digitados é de : " + somaid / 7);
    }
}
