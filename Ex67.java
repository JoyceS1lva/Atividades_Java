package Lista100Ex;

public class Ex67 {
    public static void main(String[] args) {
        int soma = 0;

        for(int i = 1; i < 101; i++){
            soma += i;
        }

        System.out.print("A soma dos números entre 1 e 100 é de : " + soma);
    }
}
