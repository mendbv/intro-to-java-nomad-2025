import java.io.IOException;
import java.util.Scanner;

public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    var name = scanner.nextLine();
    double salary = scanner.nextDouble();
    double sales = scanner.nextDouble();

    double salesRecieved = sales * 0.15;

    double finalSalary = salary + salesRecieved;

    System.out.printf("TOTAL = R$ %.2f%n", finalSalary);

    scanner.close();
}