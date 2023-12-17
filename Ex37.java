package Lista100Ex;

public class Ex37 {
    public static void main(String[] args) {
        int i = 0, soma = 0;

        while (i < 100){
            i += 1;
            soma += i;
            if (i == 100){
                break;
            }
        }
        System.out.print("A soma total entre 1 e 100 é de : " + soma);
    }
}
