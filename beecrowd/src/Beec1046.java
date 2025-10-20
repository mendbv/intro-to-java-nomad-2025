import java.util.Scanner;

public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);

    int start = scanner.nextInt();
    int end = scanner.nextInt();

    int duration;

    if (start == end) {
        duration = 24;
    } else if (start<end) {
        duration = end - start;
    } else {
        duration = (24 - start) + end;
    }

    System.out.printf("O JOGO DUROU %d HORA(S)\n", duration);

    scanner.close();
}