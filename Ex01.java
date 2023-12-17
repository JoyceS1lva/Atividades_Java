package Lista100Ex;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args){
        int n1, n2;

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite dois números inteiros : ");

        System.out.print("Primeiro número : ");
        n1 = valor.nextInt();

        System.out.print("Segundo número : ");
        n2 = valor.nextInt();

        System.out.println(String.format("A soma entre %d e %d é igual a = %d", n1, n2, (n1 + n2)));
        System.out.println(String.format("A subtração entre %d e %d é igual a = %d", n1, n2, (n1 - n2)));
        System.out.println(String.format("A divisão entre %d e %d é igual a = %d", n1, n2, (n1 / n2)));
        System.out.println(String.format("A multiplicação entre %d e %d é igual a = %d", n1, n2, (n1 * n2)));
    }
}
