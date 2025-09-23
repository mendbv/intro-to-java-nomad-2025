import java.util.Scanner;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();

    int greaterAB = (a + b + Math.abs(a - b)) / 2;

    int greatest = (greaterAB + c + Math.abs(greaterAB - c)) / 2;

    System.out.println(greatest + " eh o maior");

    scanner.close();
}