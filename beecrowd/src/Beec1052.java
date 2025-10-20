import java.util.Scanner;
import java.io.IOException;

public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    
    int input = scanner.nextInt();
    String month = "";
    
    switch(input){
        case 1 -> month="January";
        case 2 -> month="February";
        case 3 -> month="March";
        case 4 -> month="April";
        case 5 -> month="May";
        case 6 -> month="June";
        case 7 -> month="July";
        case 8 -> month="August";
        case 9 -> month="September";
        case 10 -> month="October";
        case 11 -> month="November";
        case 12 -> month="December";
        default -> System.out.println("Invalid month");
    }

    System.out.println(month);
}