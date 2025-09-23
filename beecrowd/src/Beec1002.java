import java.io.IOException;
import java.util.Scanner;

public static void main(String[] args) throws IOException {

    Scanner scanner = new Scanner(System.in);

    double pi = 3.14159;

    double r = scanner.nextDouble();

    double area = pi * Math.pow(r, 2);

    System.out.printf("A=%.4f%n", area);

    scanner.close();
}