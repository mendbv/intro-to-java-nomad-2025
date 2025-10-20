import java.io.IOException;
import java.util.Scanner;

public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int n1 = scanner.nextInt();
    int n2 = scanner.nextInt();
    int n3 = scanner.nextInt();
    int n4 = scanner.nextInt();
    int n5 = scanner.nextInt();

    int evenCount = 0;

    if (n1 % 2 == 0) {
        evenCount += 1;
    }

    if (n2 % 2 == 0) {
        evenCount += 1;
    }

    if (n3 % 2 == 0) {
        evenCount += 1;
    }

    if (n4 % 2 == 0) {
        evenCount += 1;
    }

    if (n5 % 2 == 0) {
        evenCount += 1;
    }

    System.out.println(evenCount + " valores pares");

    scanner.close();
}