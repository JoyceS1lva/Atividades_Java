package Lista100Ex;

import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        String nome, turno;

        Scanner valor = new Scanner(System.in);

        System.out.print("Digite seu nome : ");
        nome = valor.next();

        System.out.print("Turno (M/V) : ");
        turno = valor.next().toUpperCase();

        if (turno.equals("M")){
            System.out.printf("Bom dia, %s", nome);
        }
        else if(turno.equals("V")){
            System.out.printf("Boa tarde, %s", nome);
        }
    }
}
