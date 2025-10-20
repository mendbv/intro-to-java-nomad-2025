import java.util.Scanner;
import java.io.IOException;

public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    double n1 = scanner.nextInt();
    double n2 = scanner.nextInt();
    double n3 = scanner.nextInt();
    double n4 = scanner.nextInt();
    double n5 = scanner.nextInt();
    double n6 = scanner.nextInt();

    int total = 0;

    if (n1 > 0){
        total += 1;
    } else {
        total+=0;
    }

    if (n2 > 0){
        total += 1;
    } else {
        total+=0;
    }

    if (n3 > 0){
        total += 1;
    } else {
        total+=0;
    }

    if (n4 > 0){
        total += 1;
    } else {
        total+=0;
    }

    if (n5 > 0){
        total += 1;
    } else {
        total+=0;
    }

    if (n6 > 0){
        total += 1;
    } else {
        total+=0;
    }

    System.out.println(total+ " valores positivos");
}