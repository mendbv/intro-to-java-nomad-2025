import java.io.IOException;
import java.util.Scanner;

public static void main(String[] args) throws IOException {

    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();

    int result = (a / b);

    if (a % b == 0 || b % a == 0){
        System.out.println("Sao Multiplos");
    } else {
        System.out.println("Nao sao Multiplos");
    }

    scanner.close();
}