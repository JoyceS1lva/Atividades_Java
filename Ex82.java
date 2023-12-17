package Lista100Ex;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex82 {
    public static void main(String[] args) {
        int num, somanum = 0;

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite 10 números inteiros e veja a soma entre eles : ");

        ArrayList<Integer> lista = new ArrayList<>();

        for(int i = 0; i < 10; i ++){
            System.out.printf("Número %d : ", i + 1);
            num = valor.nextInt();
            lista.add(num);
        }

        for(int i : lista){
            somanum += i;
        }

        System.out.print("A soma entre todos os números digitados é de : " + somanum);

        valor.close();
    }
}
