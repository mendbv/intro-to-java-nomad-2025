import java.util.Scanner;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int totalDays = scanner.nextInt();
    scanner.close();

    int years = totalDays / 365;
    int remainingDaysAfterYears = totalDays % 365;
    int months = remainingDaysAfterYears / 30;
    int days = remainingDaysAfterYears % 30;

    System.out.printf("%d ano(s)%n", years);
    System.out.printf("%d mes(es)%n", months);
    System.out.printf("%d dia(s)%n", days);
}