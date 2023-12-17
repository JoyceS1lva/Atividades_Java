package Lista100Ex;
import java.util.Scanner;

public class Ex85 {
    public static void main(String[] args) {
        int[] num = new int[5];
        int n1, maior = 0, menor = 0, quant = 1;

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite 5 números e veja o maior e menor deles");

        for(int i = 0; i < 5; i ++){
            System.out.printf("Número %d : ", i + 1);
            n1 = valor.nextInt();

            if(quant == 1){
                maior = n1;
                menor = n1;
            }
            else{
                if(n1 > maior){
                    maior = n1;
                }
                else if(n1 < menor){
                    menor = n1;
                }
            }

            quant += 1;
        }

        System.out.printf("O maior número é %d e o menor número é %d", maior, menor);

    }
}
