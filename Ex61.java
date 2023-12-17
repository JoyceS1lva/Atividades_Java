package Lista100Ex;
import java.util.Scanner;

public class Ex61 {
    public static void main(String[] args) {
        int num, soma = 0, i = 0;

        Scanner valor = new Scanner(System.in);

        System.out.print("Digite um número inteiro : ");
        num = valor.nextInt();

        do{
            if (i % 2 == 0){
                soma += i;
            }
            i += 1;
        }while (i < num);

        System.out.printf("A soma de todos os números pares entre 1 e %d é de : %d ",num,  soma);
    }
}
