import java.io.IOException;
import java.util.Scanner;

public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int startHour = scanner.nextInt();
    int startMinute = scanner.nextInt();
    int endHour = scanner.nextInt();
    int endMinute = scanner.nextInt();

    int startTotalMinutes = startHour * 60 + startMinute;
    int endTotalMinutes = endHour * 60 + endMinute;

    int durationTotalMinutes;

    if (startTotalMinutes < endTotalMinutes) {
        durationTotalMinutes = endTotalMinutes - startTotalMinutes;
    } else {
        durationTotalMinutes = (1440 - startTotalMinutes) + endTotalMinutes;
    }

    int durationHours = durationTotalMinutes / 60;
    int durationMinutes = durationTotalMinutes % 60;

    System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", durationHours, durationMinutes);

    scanner.close();
}