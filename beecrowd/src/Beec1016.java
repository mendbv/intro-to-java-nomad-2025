import java.io.IOException;
import java.util.Scanner;

public static void main(String[] args) throws IOException {

    Scanner sc = new Scanner(System.in);

    int distance = sc.nextInt();

    int timeInMinutes = distance * 2;

    System.out.println(timeInMinutes + " minutos");

    sc.close();
}