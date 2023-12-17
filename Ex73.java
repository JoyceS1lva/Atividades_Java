package Lista100Ex;
import java.util.Scanner;

public class Ex73 {
    public static void main(String[] args) {
        int num, n1 = 0, n2 = 1, n3 = 1;

        Scanner valor = new Scanner(System.in);

        System.out.print("Digite até qual valor quer ver a sequencia de Fibonnaci : ");
        num = valor.nextInt();

        System.out.printf("%d - %d - %d - ", n1,n2,n3);

        for(int i = 3; i < num;) {
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;

            if (i == 19){
                System.out.print(n3);
            }
            else {
                System.out.print(n3 + " - ");
            }
            i += 1;
        }
    }
}

