package Lista100Ex;

import java.util.Scanner;

public class Ex42 {
    public static void main(String[] args) {
        int num, i = 1, primo = 0;

        Scanner valor = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo e veja seus divisores : ");
        num = valor.nextInt();

        while (i <= num){
            if (num % i == 0){
                if (i == num){
                    System.out.print(i);
                }
                else {
                    System.out.print(i + "-");
                }
                primo += 1;
            }
            i += 1;
        }
        if (primo <= 2) {
            System.out.print("\nEste é um número primo");
        }
        else{
            System.out.print("\nNão é um número primo");
        }
    }
}
