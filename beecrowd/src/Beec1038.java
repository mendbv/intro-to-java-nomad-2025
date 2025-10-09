import java.util.Scanner;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int code = scanner.nextInt();
    int quantity = scanner.nextInt();

    double productPrice = 0;

    switch(code){
        case 1:
            productPrice = 4.00;
            break;
        case 2:
            productPrice = 4.50;
            break;
        case 3:
            productPrice = 5.00;
            break;
        case 4:
            productPrice = 2.00;
            break;
        case 5:
            productPrice = 1.50;
        default:
            System.out.println("Wrong product code!");
    }

    double result = (productPrice * quantity);

    System.out.printf("Total: R$ %.2f%n", result);
}