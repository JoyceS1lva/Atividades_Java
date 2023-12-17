package Lista100Ex;
import java.util.Scanner;

public class Ex54 {
    public static void main(String[] args){
        int i = 1, num, soma = 0, quant = 0;

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite 5 valores inteiros e veja sua média aritmética : ");

        do{
            System.out.printf("Número %d = ", i);
            num = valor.nextInt();

            quant += 1;
            soma += num;

            i += 1;
        }while(i <= 5);

        System.out.print("A média aritmética dos valores informados é de : " + (soma / quant));
    }
}
