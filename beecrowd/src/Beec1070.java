import java.io.IOException;
import java.util.Scanner;

public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int X = scanner.nextInt();

    // Если X четное, делаем его нечетным (X + 1)
    if (X % 2 == 0) {
        X++;
    }

    // Выводим 6 нечетных чисел, увеличивая счетчик на 2
    for (int i = 0; i < 6; i++) {
        System.out.println(X);
        X += 2;
    }

    scanner.close();
}