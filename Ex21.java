package Lista100Ex;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        int gp, idade, maior = 0, menor = 0;

        Scanner valor = new Scanner(System.in);

        System.out.print("Quantas pessoas fazem parte do seu grupo ? ");
        gp = valor.nextInt();

        for (int i = 1; i <= gp; i++){
            System.out.print(String.format("Idade da %d° pessoa : ", i));
            idade = valor.nextInt();

            if (idade >= 18){
                maior += 1;
            }
            else{
                menor += 1;
            }
        }

        System.out.printf("Neste grupo são %d pessoas maiores de idade e %d menores", maior, menor);
    }
}
