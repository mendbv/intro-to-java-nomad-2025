import java.io.IOException;
import java.util.Scanner;

public static void main(String[] args) throws IOException {

    Scanner scanner = new Scanner(System.in);

    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();

    double temp;

    if (b > a) {
        temp = a;
        a = b;
        b = temp;
    }

    if (c > a) {
        temp = a;
        a = c;
        c = temp;
    }

    if (c > b) {
        temp = b;
        b = c;
        c = temp;
    }

    if (a >= b + c) {
        System.out.println("NAO FORMA TRIANGULO");
    } else {
        double a2 = Math.pow(a, 2);
        double b2 = Math.pow(b, 2);
        double c2 = Math.pow(c, 2);

        if (a2 == b2 + c2) {
            System.out.println("TRIANGULO RETANGULO");
        } else if (a2 > b2 + c2) {
            System.out.println("TRIANGULO OBTUSANGULO");
        } else {
            System.out.println("TRIANGULO ACUTANGULO");
        }

        if (a == b && b == c) {
            System.out.println("TRIANGULO EQUILATERO");
        }
        else if (a == b || b == c || a == c) {
            System.out.println("TRIANGULO ISOSCELES");
        }
    }

    scanner.close();
}