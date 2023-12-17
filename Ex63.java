package Lista100Ex;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex63 {
    public static void main(String[] args){
        int num, n1, c = 0;

        Scanner valor = new Scanner(System.in);

        System.out.print("Digite um número e veja ele separadamente : ");
        num = valor.nextInt();

        ArrayList<Integer> cresc = new ArrayList<>();

        do{
            n1 = num % 10;
            num = num / 10;

            cresc.add(0, n1);
        }while(num > 0);


        for(int i : cresc){
            c += 1;
            if (c == cresc.size()){
                System.out.print(i);
            }
            else{
                System.out.print(i + " - ");
            }
        }

    }
}
