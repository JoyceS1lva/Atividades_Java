package Lista100Ex;
import java.util.Scanner;

public class Ex49 {
    public static void main(String[] args) {
        int num, f = 0, c;

        Scanner valor = new Scanner(System.in);

        System.out.print("Digite um número inteiro e veja seu fatorial : ");
        num = valor.nextInt();

        c = num - 1;
        f = num;

        System.out.print("!" + num + " = ");

        while (c > 0) {
            if (c > 0) {
                System.out.print(c + 1 + " x ");
            }
            f = f * c;
            c -= 1;
            if(c == 0){
                System.out.print(c + 1 + " = ");
            }
        }
        
        System.out.print(f);
    }
}
