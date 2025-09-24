import java.io.IOException;
import java.util.Scanner;

public static void main(String[] args) throws IOException {

    Scanner sc = new Scanner(System.in);

    int amount = sc.nextInt();

    System.out.println(amount);

    int[] notes = {100, 50, 20, 10, 5, 2, 1};

    for (int note : notes) {
        int count = amount / note;
        System.out.println(count + " nota(s) de R$ " + note + ",00");
        amount %= note;
    }

    sc.close();

}