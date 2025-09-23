import java.io.IOException;
import java.util.Scanner;

public static void main(String[] args) throws IOException {

    Scanner scanner = new Scanner(System.in);

    double pi = 3.14159;
    double r = scanner.nextDouble();

    double radius = Math.pow(r, 3);

    double calculate = (4/3.0) * pi * radius;

    System.out.printf("VOLUME = %.3f%n", calculate);
}