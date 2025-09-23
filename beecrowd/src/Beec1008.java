import java.io.IOException;
import java.util.Scanner;

public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int employeeNum = scanner.nextInt();
    int workedHours = scanner.nextInt();
    double salaryPerHour = scanner.nextDouble();

    double finalSalary = salaryPerHour * workedHours;

    System.out.println("NUMBER = " + employeeNum);
    System.out.printf("SALARY = U$ %.2f%n", finalSalary);

    scanner.close();
}