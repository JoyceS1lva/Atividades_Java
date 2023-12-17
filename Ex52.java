package Lista100Ex;

public class Ex52 {
    public static void main(String[] args){
        int i = 0, soma = 0;

        do{
            i ++;
            soma += i;
            if(i == 10){
                break;
            }
        }while(i <= 10);

        System.out.print(soma);
    }
}
