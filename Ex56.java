package Lista100Ex;

import java.util.Scanner;

public class Ex56 {
    public static void main(String[] args) {
        int num, i = 1;

        Scanner valor = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo e veja seus divisores : ");
        num = valor.nextInt();

        do{
            if(num % i == 0){
                if(i < num) {
                    System.out.print(i + " - ");
                }
                else{
                    System.out.print(i);
                }
            }
            i += 1;
        }while(i <= num);


    }
}
