package Lista100Ex;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        int n;

        Scanner valor = new Scanner(System.in);

        System.out.print("Digite um número e veja se ele é positivo, negativo ou zero : ");
        n = valor.nextInt();

        if (n < 0){
            System.out.print("Número Negativo");
        }
        else if (n == 0){
            System.out.print("Número Zero");
        }
        else{
            System.out.print("Número Posítivo");
        }
    }
}
