import java.io.IOException;
import java.util.Scanner;

public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int X = scanner.nextInt();

    if (X % 2 == 0) {
        X++;
    }

    for (int i = 0; i < 6; i++) {
        System.out.println(X);
        X += 2;
    }

    scanner.close();
}