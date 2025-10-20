import java.io.IOException;
import java.util.Scanner;

public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    String s1 = scanner.next();
    int dayStart = scanner.nextInt();
    int hourStart = scanner.nextInt();
    String s2 = scanner.next();
    int minuteStart = scanner.nextInt();
    String s3 = scanner.next();
    int secondStart = scanner.nextInt();

    String s4 = scanner.next();
    int dayEnd = scanner.nextInt();
    int hourEnd = scanner.nextInt();
    String s5 = scanner.next();
    int minuteEnd = scanner.nextInt();
    String s6 = scanner.next();
    int secondEnd = scanner.nextInt();

    long totalSecondsStart = secondStart + minuteStart * 60L + hourStart * 3600L + dayStart * 86400L;
    long totalSecondsEnd = secondEnd + minuteEnd * 60L + hourEnd * 3600L + dayEnd * 86400L;

    long durationSeconds = totalSecondsEnd - totalSecondsStart;

    long days = durationSeconds / 86400L;
    durationSeconds %= 86400L;

    long hours = durationSeconds / 3600L;
    durationSeconds %= 3600L;

    long minutes = durationSeconds / 60L;
    long seconds = durationSeconds % 60L;

    System.out.println(days + " dia(s)");
    System.out.println(hours + " hora(s)");
    System.out.println(minutes + " minuto(s)");
    System.out.println(seconds + " segundo(s)");

    scanner.close();
}