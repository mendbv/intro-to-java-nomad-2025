import java.io.IOException;
import java.util.Scanner;

public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int X = scanner.nextInt();

    for (int i = 1; i <= X; i += 2) {
        System.out.println(i);
    }

    scanner.close();
}