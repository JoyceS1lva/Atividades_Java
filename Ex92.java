package Lista100Ex;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex92 {
    public static void main(String[] args) {
        int n1;

        Scanner valor = new Scanner(System.in);

        ArrayList<Integer> cresc = new ArrayList<>();

        System.out.println("Digite 10 valores e veja-os em ordem crescente : ");

        for(int i = 0; i < 10; i ++){
            System.out.printf("Número %d : ", i + 1);
            n1 = valor.nextInt();

            cresc.add(n1);
        }

        Collections.reverse(cresc);

        for(int i: cresc){
            System.out.print(i);
        }
    }
}
