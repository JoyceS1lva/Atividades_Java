package Lista100Ex;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        int quant;
        float preco, desc;

        Scanner valor = new Scanner(System.in);

        System.out.println("LOJAS FIT");

        System.out.print("Digite o valor do produto : R$");
        preco = valor.nextFloat();

        System.out.print("Quantidade : ");
        quant = valor.nextInt();

        desc = (preco - ((preco * 10) / 100));

        if (quant > 10) {
            System.out.printf("Valor total com desconto de %s : R$ %.2f", "10%", desc);
        }
        else{
            System.out.printf("Valor total : R$ %.2f", preco);
        }
    }
}
