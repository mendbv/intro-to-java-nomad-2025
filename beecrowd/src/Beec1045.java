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

    
}