import java.util.Scanner;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();
    double media = ((a * 2) + (b * 3) + (c * 5)) / 10.0;
    System.out.printf("MEDIA = %.5f%n", media);
}