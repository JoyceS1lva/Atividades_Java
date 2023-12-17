package Lista100Ex;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        int anos, meses, dias;
        int diasdomes[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite quandos anos, meses e dias você tem, e veja quantos dias tem no total");
        System.out.print("Anos : ");
        anos = valor.nextInt();

        System.out.print("Meses : ");
        meses = valor.nextInt();

        System.out.print("Dias : ");
        dias = valor.nextInt();

        System.out.printf("De acordo com os dados informados, desde que nasceu você tem %d dias de vida"
        , (anos * 365) + (meses * 30) + dias);

    }
}
