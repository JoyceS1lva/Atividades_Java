package Lista100Ex;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        double dep, jur;

        Scanner valor = new Scanner(System.in);

        System.out.print("Depósito mensal : R$");
        dep = valor.nextFloat();

        for (int i = 0; i < 12; i++){
            dep = (dep + ((dep * 0.5) / 100));
        }

        System.out.printf("Após 12 meses com rendimento de %s, você terá em caixa : R$%.2f", "5%", dep);
    }
}
