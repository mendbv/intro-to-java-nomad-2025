import java.io.IOException;
import java.util.Scanner;

public static void main(String[] args) throws IOException {

    Scanner scanner = new Scanner(System.in);

    int hours = scanner.nextInt();
    int avgSpeed = scanner.nextInt();

    double s = hours * avgSpeed;

    double fuelEfficiency = s/12;

    System.out.printf("%.3f%n",fuelEfficiency);

}