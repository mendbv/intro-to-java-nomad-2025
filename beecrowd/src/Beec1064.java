import java.io.IOException;
import java.util.Scanner;

public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    double n1 = scanner.nextDouble();
    double n2 = scanner.nextDouble();
    double n3 = scanner.nextDouble();
    double n4 = scanner.nextDouble();
    double n5 = scanner.nextDouble();
    double n6 = scanner.nextDouble();

    int total = 0;
    double sum = 0;

    if (n1 > 0){
        total += 1;
        sum += n1;
    }

    if (n2 > 0){
        total += 1;
        sum += n2;
    }

    if (n3 > 0){
        total += 1;
        sum += n3;
    }

    if (n4 > 0){
        total += 1;
        sum += n4;
    }

    if (n5 > 0){
        total += 1;
        sum += n5;
    }

    if (n6 > 0){
        total += 1;
        sum += n6;
    }

    System.out.println(total + " valores positivos");

    if (total > 0) {
        double mid = sum / total;
        System.out.printf("%.1f\n", mid);
    }

    scanner.close();
}