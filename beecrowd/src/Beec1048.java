import java.util.Scanner;
import java.io.IOException;

public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    double salary = scanner.nextDouble();

    double increase;
    int increasePercent;
    double result;

    if (salary >= 0 && salary <= 400.00){
        increasePercent = 15;
        increase = (salary / 100.00) * increasePercent;
        result = salary+increase;
    } else if (salary >= 400.01 && salary <= 800.00) {
        increasePercent = 12;
        increase = (salary / 100.00) * increasePercent;
        result = salary+increase;
    } else if (salary >= 800.01 && salary <= 1200.00) {
        increasePercent = 10;
        increase = (salary / 100.00) * increasePercent;
        result = salary+increase;
    } else if (salary >= 1200.01 && salary <= 2000.00) {
        increasePercent = 7;
        increase = (salary / 100.00) * increasePercent;
        result = salary+increase;
    } else {
        increasePercent = 4;
        increase = (salary / 100.00) * increasePercent;
        result = salary+increase;
    }

    System.out.printf("Novo salario: %.2f\n", result);
    System.out.printf("Reajuste ganho: %.2f\n", increase);
    System.out.println("Em percentual: " + increasePercent + " %");
}