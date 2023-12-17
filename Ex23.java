package Lista100Ex;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        String meses[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto"
        , "Setembro", "Outubro", "Novembro", "Dezembro"};
        int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String escolha;

        Scanner valor = new Scanner(System.in);

        System.out.print("Digite o nome de um dos 12 meses e veja sua quantidade de dias : ");
        escolha = valor.next();

        for (int i = 0; i < 12; i++){
            if (escolha.equals(meses[i])){
                System.out.print(dias[i]);
            }
        }
    }
}
