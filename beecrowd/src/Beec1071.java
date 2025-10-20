import java.io.IOException;
import java.util.Scanner;

public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int X = scanner.nextInt();
    int Y = scanner.nextInt();

    int min = Math.min(X, Y);
    int max = Math.max(X, Y);
    int sum = 0;

    for (int i = min + 1; i < max; i++) {
        if (i % 2 != 0) {
            sum += i;
        }
    }

    System.out.println(sum);

    scanner.close();
}