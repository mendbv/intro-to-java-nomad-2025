import java.util.Scanner;

public static void main(String[] args) throws IOException {

    Scanner scanner = new Scanner(System.in);

    int code = scanner.nextInt();
    String output;

    switch(code) {
        case 61 -> output = "Brasilia";
        case 71 -> output = "Salvador";
        case 11 -> output = "Sao paulo";
        case 21 -> output = "Rio de Janeiro";
        case 32 -> output = "Juiz de Fora";
        case 19 -> output = "Campinas";
        case 27 -> output = "Vitoria";
        case 31 -> output = "Belo Horizonte";
        default -> output = "DDD nao cadastrado";
    }

    System.out.println(output);
}