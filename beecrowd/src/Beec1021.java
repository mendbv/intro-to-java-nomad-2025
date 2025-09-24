import java.util.Scanner;
import java.text.DecimalFormat;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");
    double value = scanner.nextDouble();
    scanner.close();

    int integerPart = (int) value;
    int centsPart = (int) Math.round((value - integerPart) * 100);

    System.out.println("NOTAS:");
    int[] notes = {100, 50, 20, 10, 5, 2};
    for (int note : notes) {
        int count = integerPart / note;
        System.out.printf("%d nota(s) de R$ %s%n", count, df.format(note));
        integerPart %= note;
    }

    System.out.println("MOEDAS:");
    int[] coins = {100, 50, 25, 10, 5, 1};
    int[] coinValuesInCents = {100, 50, 25, 10, 5, 1};
    int remainingCents = integerPart * 100 + centsPart;

    for (int i = 0; i < coins.length; i++) {
        int count = remainingCents / coinValuesInCents[i];
        System.out.printf("%d moeda(s) de R$ %s%n", count, df.format(coins[i] / 100.0));
        remainingCents %= coinValuesInCents[i];
    }
}