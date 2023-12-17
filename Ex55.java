package Lista100Ex;
import java.util.Scanner;

public class Ex55 {
    public static void main(String[] args) {
        int num, i = 1;

        Scanner valor = new Scanner(System.in);

        System.out.print("Digite um número e veja sua taboada completa : ");
        num = valor.nextInt();

        do{
            System.out.println(String.format("%d x %d = %d", num, i, (num * i)));
            i += 1;
        }while(i <= 10);
    }
}
