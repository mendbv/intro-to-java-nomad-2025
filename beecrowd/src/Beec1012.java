import java.util.Scanner;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();
    double pi = 3.14159;

    double triangleArea = (a * c) / 2.0;
    System.out.printf("TRIANGULO: %.3f%n", triangleArea);

    double circleArea = pi * c * c;
    System.out.printf("CIRCULO: %.3f%n", circleArea);

    double trapezoidArea = ((a + b) / 2.0) * c;
    System.out.printf("TRAPEZIO: %.3f%n", trapezoidArea);

    double squareArea = b * b;
    System.out.printf("QUADRADO: %.3f%n", squareArea);

    double rectangleArea = a * b;
    System.out.printf("RETANGULO: %.3f%n", rectangleArea);

    scanner.close();
}