package Lista100Ex;

import java.util.Scanner;

public class Ex71 {
    public static void main(String[] args) {
        int num;

        Scanner valor = new Scanner(System.in);

        System.out.print("Digite um número inteiro e veja seus divisores : ");
        num = valor.nextInt();

        for (int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
