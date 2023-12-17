package Lista100Ex;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex81 {
    public static void main(String[] args){
        int n1;

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite 5 valores e veja-os na ordem inversa.");

        ArrayList<Integer> contrario = new ArrayList<>();

        for(int i = 0; i <=4; i ++){
            System.out.print(String.format("Número %d : ", i + 1));
            n1 = valor.nextInt();
            contrario.add(n1);
        }

        Collections.reverse(contrario);

        for(int i : contrario){
            System.out.print(i);
        }
    }
}
