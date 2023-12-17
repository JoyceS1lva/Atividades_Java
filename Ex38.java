package Lista100Ex;

public class Ex38 {
    public static void main(String[] args) {
        int i = 0;

        while (i < 51){
            if (i % 2 == 0){
                System.out.print(i);
            }
            i += 1;
            if (i == 51){
                break;
            }
        }

    }
}
