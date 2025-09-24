import java.util.Scanner;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int totalSeconds = scanner.nextInt();
    scanner.close();

    int hours = totalSeconds / 3600;
    int remainingSeconds = totalSeconds % 3600;
    int minutes = remainingSeconds / 60;
    int seconds = remainingSeconds % 60;

    System.out.printf("%d:%d:%d%n", hours, minutes, seconds);
}