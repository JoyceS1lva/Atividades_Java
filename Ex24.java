package Lista100Ex;
import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        int n1, n2, n3, a, b, c;

        Scanner valor = new Scanner(System.in);

        System.out.print("Digite três valores e veja sua ordem decrescente : \n" +
                "Valor A : ");
        n1 = valor.nextInt();
        System.out.print("Valor B : ");
        n2 = valor.nextInt();
        System.out.print("Valor C : ");
        n3 = valor.nextInt();

        if (n1 > n2 && n1 > n3){
            c = n1;
        }
        else if(n2 > n1 && n2 > n3){
            c = n2;
        }
        else{
            c = n3;
        }

        if (n1 > n2 && n1 < n3 || n1 > n3 && n1 < n2 ){
            b = n1;
        }
        else if(n2 > n1 && n2 < n3 || n2 > n3 && n2 < n1){
            b = n2;
        }
        else{
            b = n3;
        }

        if (n1 < n2 && n1 < n3){
            a = n1;
        }
        else if(n2 < n1 && n2 < n3 ){
            a = n2;
        }
        else{
            a = n3;
        }
        System.out.printf("De acordo com os números digitados a ordem correta é : %d - %d - %d", a, b, c);
    }
}