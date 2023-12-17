package Lista100Ex;

public class Ex75 {
    public static void main(String[] args) {
        int num, n1 = 0, n2 = 1, n3 = 1;

        System.out.printf("%d - %d - %d - ", n1,n2,n3);

        for(int i = 3; i < 20; i++){
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;

            if (i == 19){
                System.out.print(n3);
            }
            else {
                System.out.print(n3 + " - ");
            }
        }
    }
}

