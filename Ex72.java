package Lista100Ex;

import java.util.Scanner;

public class Ex72 {
    public static void main(String[] args) {
        int num,quant = 0;

        Scanner valor = new Scanner(System.in);

        System.out.print("Digite um número inteiro e veja seus divisores : ");
        num = valor.nextInt();

        for (int i = 1; i <= num; i++){
            if(num % i == 0){
                quant += 1;
            }
        }

        if (quant > 2){
            System.out.print("Não é um número primo");
        }
        else{
            System.out.print("É um número primo");
        }
    }
}
