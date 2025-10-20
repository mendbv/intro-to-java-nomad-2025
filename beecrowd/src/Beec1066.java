import java.io.IOException;
import java.util.Scanner;

public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int evenCount = 0;
    int oddCount = 0;
    int positiveCount = 0;
    int negativeCount = 0;

    for (int i = 0; i < 5; i++) {
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            evenCount++;
        } else {
            oddCount++;
        }

        if (number > 0) {
            positiveCount++;
        } else if (number < 0) {
            negativeCount++;
        }
    }

    System.out.println(evenCount + " valor(es) par(es)");
    System.out.println(oddCount + " valor(es) impar(es)");
    System.out.println(positiveCount + " valor(es) positivo(s)");
    System.out.println(negativeCount + " valor(es) negativo(s)");

    scanner.close();
}