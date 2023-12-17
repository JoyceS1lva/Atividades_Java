package Lista100Ex;
import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
        int num, i = 1;

        Scanner valor = new Scanner(System.in);

        System.out.print("Digite um número inteiro e veja sua taboada : ");
        num = valor.nextInt();

        while (i < 11){
            if (i == 11){
                break;
            }
            System.out.printf("%d x %d = %d\n", num, i, num * i );
            i += 1;
        }
    }
}
