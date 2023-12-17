package Lista100Ex;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
    float raio;
    double area, circ;

    Scanner valor = new Scanner(System.in);

    System.out.println("Digite o raio do circulo e veja sua área e circunferência");
    System.out.print("Raio (cm) : ");
    raio = valor.nextFloat();

    System.out.print("Circunferência (cm) : ");
    circ = valor.nextFloat();

    area = (3.14 * (raio * raio));
    circ = ((3.14 * 2) * raio);

    System.out.println("A área deste circulo é de : " + area);
    System.out.printf("O perímetro deste circulo é de : %.2f", circ);
    }
}
