import java.io.IOException;
import java.util.Scanner;

public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();

    for (int i = 2; i <= N; i += 2) {
        long square = (long) i * i;
        System.out.println(i + "^2 = " + square);
    }

    scanner.close();
}