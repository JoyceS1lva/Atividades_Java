package Lista100Ex;

public class Ex62 {
    public static void main(String[] args) {
        int num, soma = 0, i = 0;

        do{
            if (i % 2 == 1){
                if (i == 49) {
                    System.out.print(i);
                }
                else{
                    System.out.print(i + " - ");
                }
            }
            i += 1;
        }while (i < 50);

    }
}
