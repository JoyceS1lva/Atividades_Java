package Lista100Ex;
import java.util.Scanner;

public class Ex91 {
    public static void main(String[] args) {
        int[] num = new int[10];
        int n1;
        int somaposi = 0, somaneg = 0;

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite 10 números e veja o maior e menor deles");

        for (int i = 0; i < 10; i++) {
            System.out.printf("Número %d : ", i + 1);
            n1 = valor.nextInt();

            num[i] = n1;
        }

        for(int i : num){
            if(i > 0){
                somaposi += i;
            }
            else{
                somaneg += i;
            }
        }

        System.out.println(String.format("A soma entre os números positivos é de : %d", somaposi));
        System.out.println(String.format("A soma entre os números negativos é de : %d", somaneg));
    }
}