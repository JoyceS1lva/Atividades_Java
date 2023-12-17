package Lista100Ex;
import java.util.Scanner;

public class Ex88 {
    public static void main(String[] args) {
        int[] num = new int[5];
        int n1;
        float somapar = 0, quantpar = 0, somaimp = 0, quantimp = 0;

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
                somapar += i;
            }
            else{
                quantimp += 1;
                somaimp += i;
            }
        }

        System.out.println(String.format("A média entre os números pares é de : %.1f", (somapar / quantpar)));
        System.out.println(String.format("A média entre os números ímpares é de : %.1f", (somaimp / quantimp)));
    }
}