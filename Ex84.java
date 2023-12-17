package Lista100Ex;
import java.util.Scanner;

public class Ex84 {
    public static void main(String[] args) {
        int[] num = new int[5];
        int n1, totpar = 0;

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite 5 valores e veja qual deles são pares : ");

        for(int i = 0; i < 5; i ++){
            System.out.printf("Número %d : ", i + 1);
            n1 = valor.nextInt();

            if(n1 % 2 == 0){
                totpar += 1;
            }

            num[i] = n1;
        }
        System.out.print("O total de números pares digitados é de : " + totpar);
    }
}
