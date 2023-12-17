package Lista100Ex;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        float base, alt;

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite a base e altura do triângulo e veja sua área");

        System.out.print("Base : ");
        base = valor.nextFloat();

        System.out.print("Altura : ");
        alt = valor.nextFloat();

        System.out.print("De acordo com os valores dados, a área deste triângulo é de : " + (base * alt) / 2);
    }
}
